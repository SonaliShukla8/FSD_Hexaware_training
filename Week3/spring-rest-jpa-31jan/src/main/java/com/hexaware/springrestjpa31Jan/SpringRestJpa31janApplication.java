package com.hexaware.springrestjpa31Jan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringRestJpa31janApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestJpa31janApplication.class, args);
	}
    
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
