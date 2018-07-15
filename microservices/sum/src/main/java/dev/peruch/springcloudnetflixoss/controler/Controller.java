package dev.peruch.springcloudnetflixoss.controler;

import dev.peruch.springcloudnetflixoss.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    SumService sumService;

    @RequestMapping("/sum")
    public String sum(){
        return "Please add two two values on the url \n" +
               " example: /sum/{firstValue}/{secondValue}";
    }

    @RequestMapping("/sum/{firstValue}/{secondValue}")
    public String sum(@PathVariable double firstValue,
                      @PathVariable double secondValue){
        return sumService.execute(firstValue, secondValue);
    }
}
