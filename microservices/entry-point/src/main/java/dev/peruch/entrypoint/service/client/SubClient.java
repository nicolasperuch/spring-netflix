package dev.peruch.entrypoint.service.client;

import feign.Param;
import feign.RequestLine;

public interface SubClient {

    @RequestLine("GET /sub")
    String callSub();

    @RequestLine("GET /sub/{firstValue}/{secondValue}")
    String callSub(@Param("firstValue") double firstValue,
                   @Param("secondValue") double secondValue);
}
