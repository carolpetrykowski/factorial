package com.spring.factorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class FactorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactorialApplication.class, args);
	}

}
