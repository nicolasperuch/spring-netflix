package dev.peruch.springcloudnetflixoss.controler;

import dev.peruch.springcloudnetflixoss.business.Sum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired Sum sum;

    @RequestMapping("/")
    public String home(){
        return "Home Page";
    }

    @RequestMapping("/sum/{firstValue}/{secondValue}")
    public double sum(@PathVariable double firstValue,
                      @PathVariable double secondValue){
        return sum.execute(firstValue, secondValue);
    }
}
