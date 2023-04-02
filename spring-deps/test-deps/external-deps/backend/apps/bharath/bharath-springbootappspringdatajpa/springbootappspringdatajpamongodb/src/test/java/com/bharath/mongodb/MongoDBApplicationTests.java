package com.bharath.mongodb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.mongodb.model.Product;
import com.bharath.mongodb.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MongoDBApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test_1_Save() {
		Product product = new Product();
		product.setName("IPhone");
		product.setPrice(1000.00);
		Product savedProduct = productRepository.save(product);
		assertNotNull(savedProduct);
	}

	@Test
	public void test_2_findAll() {
		List<Product> products = productRepository.findAll();
		assertEquals(1, products.size());
	}

	@Test
	public void test_3_deleteAll() {
		productRepository.deleteAll();
		Optional<Product> product = productRepository.findById("614dc05d2f7371365f9785e8");
		assertEquals(Optional.empty(), product);
	}

}
