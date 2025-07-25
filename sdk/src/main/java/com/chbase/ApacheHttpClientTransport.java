package com.chbase;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.apache.hc.client5.http.ConnectionKeepAliveStrategy;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.config.ConnectionConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.protocol.HttpClientContext;
import org.apache.hc.core5.http.HeaderElement;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.io.SocketConfig;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicHeaderElementIterator;
import org.apache.hc.core5.util.TimeValue;
import org.apache.hc.core5.util.Timeout;

public class ApacheHttpClientTransport implements Transport {

    private static final CloseableHttpClient client = buildClient();

    private URI uri;
    private int connectionTimeout = 30000; // default 30s
    private int readTimeout = 30000;       // default 30s

    public void setUrl(URI uri) {
        this.uri = uri;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    private static CloseableHttpClient buildClient() {
        PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
        connManager.setMaxTotal(100);
        connManager.setDefaultMaxPerRoute(20);

        SocketConfig socketConfig = SocketConfig.custom()
            .setTcpNoDelay(true)
            .build();
        connManager.setDefaultSocketConfig(socketConfig);

        ConnectionConfig connectionConfig = ConnectionConfig.custom()
            .setTimeToLive(5, TimeUnit.MINUTES)
            .build();
        connManager.setDefaultConnectionConfig(connectionConfig);

        ConnectionKeepAliveStrategy keepAliveStrategy = (response, context) -> {
            BasicHeaderElementIterator it = new BasicHeaderElementIterator(
                response.headerIterator(HttpHeaders.KEEP_ALIVE));
            while (it.hasNext()) {
                HeaderElement he = it.next();
                if ("timeout".equalsIgnoreCase(he.getName()) && he.getValue() != null) {
                    return TimeValue.ofSeconds(Long.parseLong(he.getValue()));
                }
            }
            return TimeValue.ofSeconds(60); // Default keep-alive 60s
        };

        return HttpClients.custom()
            .setConnectionManager(connManager)
            .setKeepAliveStrategy(keepAliveStrategy)
            .build();
    }

    @Override
    public void doRequest(String request, ResponseHandler responseHandler) {
        try {
            HttpPost httpPost = new HttpPost(uri);
            httpPost.setEntity(new StringEntity(request));
            httpPost.setHeader("Content-Type", "text/xml");

            // Apply request-specific timeouts
            HttpClientContext context = HttpClientContext.create();
            context.setRequestConfig(org.apache.hc.client5.http.config.RequestConfig.custom()
                .setConnectTimeout(Timeout.ofMilliseconds(connectionTimeout))
                .setResponseTimeout(Timeout.ofMilliseconds(readTimeout))
                .build());

            client.execute(httpPost, context, response -> {
                if (response.getCode() >= 200 && response.getCode() < 300) {
                    responseHandler.handleResponse(response.getEntity().getContent());
                } else {
                    throw new HVTransportException("HTTP Error: " + response.getCode());
                }
                return null;
            });
        } catch (IOException e) {
            throw new HVTransportException(e);
        }
    }
}
