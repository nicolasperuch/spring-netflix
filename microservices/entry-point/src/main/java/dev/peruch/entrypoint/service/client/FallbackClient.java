package dev.peruch.entrypoint.service.client;

import feign.RequestLine;

public interface FallbackClient {

    @RequestLine("GET /")
    String callFallback();
}
