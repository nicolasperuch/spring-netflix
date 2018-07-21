package dev.peruch.entrypoint.service;

import dev.peruch.entrypoint.service.client.FallbackClient;
import dev.peruch.entrypoint.service.client.SumClient;
import org.springframework.beans.factory.annotation.Autowired;


public class RequestService {

    @Autowired
    SumClient sum;
    @Autowired
    FallbackClient fallback;

    public String callSum(){
        return sum.callSum();
    }

    public String callFallback(){
        return fallback.callFallback();
    }

}
