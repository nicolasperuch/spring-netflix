package dev.peruch.entrypoint.service.client;

import feign.RequestLine;

public interface SumClient {

    @RequestLine("GET /sum")
    String callSum();

}
