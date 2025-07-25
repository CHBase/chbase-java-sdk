package com.chbase;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OkHttpTransport implements Transport {

    private OkHttpClient client;
    private String url;
    private int connectionTimeout = 30000;
    private int readTimeout = 30000;

    private boolean clientNeedsRebuild = true;

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        this.clientNeedsRebuild = true;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
        this.clientNeedsRebuild = true;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private void ensureClient() {
        if (client == null || clientNeedsRebuild) {
            this.client = new OkHttpClient.Builder()
                    .connectTimeout(connectionTimeout, TimeUnit.MILLISECONDS)
                    .readTimeout(readTimeout, TimeUnit.MILLISECONDS)
                    .build();
            this.clientNeedsRebuild = false;
        }
    }

    @Override
    public void doRequest(String request, ResponseHandler responseHandler) {
        ensureClient();

        RequestBody body = RequestBody.create(request, MediaType.parse("application/xml"));

        okhttp3.Request okHttpRequest = new okhttp3.Request.Builder()
                .url(this.url)
                .post(body)
                .build();

        try (okhttp3.Response okHttpResponse = client.newCall(okHttpRequest).execute()) {
            if (!okHttpResponse.isSuccessful()) {
                throw new HVTransportException("HTTP error code: " + okHttpResponse.code());
            }

            if (okHttpResponse.body() != null) {
                responseHandler.handleResponse(okHttpResponse.body().byteStream());
            } else {
                throw new HVTransportException("Empty response body");
            }
        } catch (IOException e) {
            throw new HVTransportException(e);
        }
    }
}
