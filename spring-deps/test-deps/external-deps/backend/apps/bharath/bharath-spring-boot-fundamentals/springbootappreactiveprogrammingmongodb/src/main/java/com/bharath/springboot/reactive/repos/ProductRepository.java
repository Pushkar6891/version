package com.bharath.springboot.reactive.repos;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bharath.springboot.reactive.entities.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

}
