package dev.peruch.springcloudnetflixoss.config;

import dev.peruch.springcloudnetflixoss.business.Sum;
import dev.peruch.springcloudnetflixoss.service.SumService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public Sum sum(){
        return new Sum();
    }

    @Bean
    public SumService sumService(){
        return new SumService(sum());
    }
}
