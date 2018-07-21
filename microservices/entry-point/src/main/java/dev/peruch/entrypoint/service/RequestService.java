package dev.peruch.entrypoint.service;

import dev.peruch.entrypoint.service.client.FallbackClient;
import dev.peruch.entrypoint.service.client.SubClient;
import dev.peruch.entrypoint.service.client.SumClient;
import org.springframework.beans.factory.annotation.Autowired;


public class RequestService {

    @Autowired
    SumClient sum;
    @Autowired
    SubClient sub;
    @Autowired
    FallbackClient fallback;

    public String callSum(){
        return sum.callSum();
    }

    public String callSum(double firstValue, double secondValue){
        return sum.callSum(firstValue, secondValue);
    }

    public String callSub(){
        return sub.callSub();
    }

    public String callSub(double firstValue, double secondValue){
        return sub.callSub(firstValue, secondValue);
    }

    public String callFallback(){
        return fallback.callFallback();
    }

}
