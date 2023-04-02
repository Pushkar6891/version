package com.company.app.springbootapptest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.company.app.springbootapptest.config",
											"com.company.app.springbootapptest.controller", 
											"com.company.app.springbootapptest.service" })
public class SpringBootAppRunner implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppRunner.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
