package dev.peruch.springcloudnetflixoss.config;

import dev.peruch.springcloudnetflixoss.business.Sum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public Sum sum(){
        return new Sum();
    }
}
