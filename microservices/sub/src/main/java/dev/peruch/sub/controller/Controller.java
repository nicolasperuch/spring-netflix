package dev.peruch.sub.controller;

import dev.peruch.sub.service.SubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private SubService subService;


    @RequestMapping("/sub")
    public String sub(){
        return "Please add two two values on the url \n" +
                " example: /sub/{firstValue}/{secondValue}";
    }

    @RequestMapping("/sub/{firstValue}/{secondValue}")
    public String sub(@PathVariable double firstValue,
                      @PathVariable double secondValue){
        return subService.execute(firstValue, secondValue);
    }
}