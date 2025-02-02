package com.home.evuela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class EvuelaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvuelaApplication.class, args);
	}

}
