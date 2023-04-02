package com.bharath.springboot.reactive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bharath.springboot.reactive.controllers.ProductController;
import com.bharath.springboot.reactive.entities.Product;
import com.bharath.springboot.reactive.repos.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
class ReactivemongodemoApplicationTests {
	
	@Autowired
	ProductController controller;
	
	@MockBean
	ProductRepository repo;

	@Test
	void testAddProduct() {
		Product product = new Product(null,"IPhone","Its Cool",1200d);
		Product savedProduct = new Product("abc123","IPhone","Its Cool",1200d);
		when(repo.save(product)).thenReturn(Mono.just(savedProduct));
		
		StepVerifier.create(controller.addProduct(product))
					.assertNext(p->{
						assertNotNull(p);
						assertNotNull(p.getId());
						assertEquals("abc123", p.getId());
						
					})
					.expectComplete()
					.verify();
		verify(repo).save(product);
		
	}
	
	@Test
	void testGetProducts() {
		when(repo.findAll()).thenReturn(Flux.just(
				new Product("abc123","IPhone","Its Cool",1200d),
				new Product("abc124","IPhone","Its Cool",1200d),
				new Product("abc125","IPhone","Its Cool",1200d)));
		StepVerifier.create(controller.getProducts())
					.expectNextCount(3)
					.expectComplete()
					.verify();
		verify(repo).findAll();
	}

	

}








