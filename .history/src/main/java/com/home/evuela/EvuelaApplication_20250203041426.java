package com.home.evuela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.home.evuela")
public class EvuelaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvuelaApplication.class, args);
	}

}
