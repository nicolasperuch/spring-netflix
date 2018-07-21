package dev.peruch.entrypoint.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import dev.peruch.entrypoint.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired RequestService service;

    @RequestMapping(value = {"/", "/home"})
    public String home(){
        return "Home Page";
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("/sum")
    public String sum(){
        return service.callSum();
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("/sum/{firstValue}/{secondValue}")
    public String sum(@PathVariable double firstValue,
                      @PathVariable double secondValue){
        return service.callSum(firstValue, secondValue);
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("/sub")
    public String sub(){
        return service.callSub();
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("/sub/{firstValue}/{secondValue}")
    public String sub(@PathVariable double firstValue,
                      @PathVariable double secondValue){
        return service.callSub(firstValue, secondValue);
    }

    @RequestMapping("/fallback")
    public String fallback(){
        return service.callFallback();
    }

    public String fallback(double firstValue, double secondValue){
        return service.callFallback();
    }
}

