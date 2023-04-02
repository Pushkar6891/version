package com.javatechie.crud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product API", version = "2.0", description = "Product  Microservice"))
public class SpringBootOpenAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOpenAPIApplication.class, args);
	}

}
