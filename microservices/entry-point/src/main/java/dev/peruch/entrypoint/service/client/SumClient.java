package dev.peruch.entrypoint.service.client;

import feign.Param;
import feign.RequestLine;

public interface SumClient {

    @RequestLine("GET /sum")
    String callSum();

    @RequestLine("GET /sum/{firstValue}/{secondValue}")
    String callSum(@Param("firstValue") double firstValue,
                   @Param("secondValue") double secondValue);

}
