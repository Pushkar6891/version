package com.bharath.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bharath.mongodb.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
