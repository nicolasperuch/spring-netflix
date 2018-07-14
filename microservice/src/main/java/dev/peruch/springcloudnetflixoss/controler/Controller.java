package dev.peruch.springcloudnetflixoss.controler;

import dev.peruch.springcloudnetflixoss.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableCircuitBreaker
@RestController
public class Controller {

    @Autowired
    SumService sumService;

    @RequestMapping("/")
    public String home(){
        return "Home Page";
    }

    @RequestMapping("/sum/{firstValue}/{secondValue}")
    public double sum(@PathVariable double firstValue,
                      @PathVariable double secondValue){
        return sumService.execute(firstValue, secondValue);
    }
}
