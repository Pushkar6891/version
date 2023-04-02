package com.javatechie.spring.jsonDocs.api;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class SpringJsonDocsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJsonDocsApplication.class, args);
	}
}
