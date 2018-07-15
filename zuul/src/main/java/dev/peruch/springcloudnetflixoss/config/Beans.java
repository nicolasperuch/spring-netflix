package dev.peruch.springcloudnetflixoss.config;

import dev.peruch.springcloudnetflixoss.filters.pre.SimpleFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }
}
