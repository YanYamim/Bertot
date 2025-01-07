package com.example.Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.Backend.Interfaces")
public class LanchesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanchesApplication.class, args);
	}

}
