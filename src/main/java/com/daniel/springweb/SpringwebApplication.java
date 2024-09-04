package com.daniel.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebApplication.class, args);
		System.out.println("spring application started");
	}
}
