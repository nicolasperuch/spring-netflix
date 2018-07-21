package dev.peruch.fallback.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String errorMessage(){
        return "We will be back soon! Please stay with us.";
    }

}
