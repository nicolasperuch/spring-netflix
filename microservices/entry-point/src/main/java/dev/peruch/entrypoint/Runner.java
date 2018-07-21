package dev.peruch.entrypoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
public class Runner {

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}
}
