package com.bharath.springboot.reactive.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.springboot.reactive.entities.Product;
import com.bharath.springboot.reactive.repos.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository repo;

	@PostMapping
	public Mono<Product> addProduct(@RequestBody Product product) {
		return repo.save(product);
	}

	@GetMapping
	public Flux<Product> getProducts() {
		return repo.findAll();
	}
}
