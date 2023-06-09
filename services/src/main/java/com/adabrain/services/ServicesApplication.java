package com.adabrain.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.adabrain.services.models")
public class ServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServicesApplication.class, args);
	}

}
