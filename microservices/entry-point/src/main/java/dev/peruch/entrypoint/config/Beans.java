package dev.peruch.entrypoint.config;

import dev.peruch.entrypoint.service.RequestService;
import dev.peruch.entrypoint.service.client.FallbackClient;
import dev.peruch.entrypoint.service.client.SumClient;
import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public RequestService requestService(){
        return new RequestService();
    }

    @Bean
    public SumClient sumClient() {
        return Feign
                .builder()
                .target(SumClient.class, "http://localhost:8090");
    }

    @Bean
    public FallbackClient fallbackClient() {
        return Feign
                .builder()
                .target(FallbackClient.class, "http://localhost:8015");
    }
}
