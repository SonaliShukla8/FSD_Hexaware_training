package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.springcore.*")
public class AppConfig {
   
	@Bean                     
	public  String   getString() {


		return new String("javeed");

	}
}
