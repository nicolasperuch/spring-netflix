package dev.peruch.entrypoint.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import dev.peruch.entrypoint.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/fallback")
    public String fallback(){
        return service.callFallback();
    }
}
