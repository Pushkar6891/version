package com.bharath.springdatajpa.product.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.springdatajpa.product.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
