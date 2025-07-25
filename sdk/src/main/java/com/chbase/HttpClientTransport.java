package com.chbase;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientTransport implements Transport {

    private static HttpClient client = buildClient();

    private URI uri;
    private static int connectionTimeout = 30000;
    private static int readTimeout = 30000;

    public void setUrl(URI uri) {
        this.uri = uri;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        if (HttpClientTransport.connectionTimeout != connectionTimeout) {
            HttpClientTransport.connectionTimeout = connectionTimeout;
            client = buildClient();
        }
    }

    public void setReadTimeout(int readTimeout) {
        if (HttpClientTransport.readTimeout != readTimeout) {
            HttpClientTransport.readTimeout = readTimeout;
            client = buildClient();
        }
    }

    private static HttpClient buildClient() {
        HttpClient.Builder builder = HttpClient.newBuilder();
        if (connectionTimeout > 0) {
            builder.connectTimeout(Duration.ofMillis(connectionTimeout));
        }
        return builder.build();
    }

    @Override
    public void doRequest(String request, ResponseHandler responseHandler) {
        try {
            HttpRequest.Builder httpRequestBuilder = HttpRequest.newBuilder()
                    .uri(uri)
                    .header("Content-Type", "text/xml")
                    .POST(HttpRequest.BodyPublishers.ofString(request));
            if (readTimeout > 0) {
                httpRequestBuilder.timeout(Duration.ofMillis(readTimeout));
            }
            HttpRequest httpRequest = httpRequestBuilder.build();

            HttpResponse<InputStream> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofInputStream());

            if (response.statusCode() >= 200 && response.statusCode() < 300) {
                responseHandler.handleResponse(response.body());
            } else {
                throw new HVTransportException("HTTP Error: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            throw new HVTransportException(e);
        }
    }
}
