package dev.peruch.sub.config;

import dev.peruch.sub.business.Sub;
import dev.peruch.sub.service.SubService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public Sub sub(){
        return new Sub();
    }

    @Bean
    public SubService subService(){
        return new SubService(sub());
    }

}
