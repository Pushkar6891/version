package com.restfulwebservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restfulwebservices.model.HelloBean;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {

	@GetMapping(path = "/hello")
	public String getHello() {
		return "Hello";
	}

	@GetMapping(path = "/hellobean")
	public HelloBean getHelloBean() {
		return new HelloBean("Hello");
	}

	@GetMapping(path = "/hellobean/path-variable/{name}")
	public HelloBean getHelloBeanUsingPathVariable(@PathVariable("name") String name) {
		return new HelloBean("Hello " + name);
	}
}