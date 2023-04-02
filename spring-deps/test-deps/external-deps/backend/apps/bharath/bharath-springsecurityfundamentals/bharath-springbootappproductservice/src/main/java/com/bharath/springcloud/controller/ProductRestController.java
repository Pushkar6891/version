package com.bharath.springcloud.controller;

import com.bharath.springcloud.dto.Coupon;
import com.bharath.springcloud.model.Product;
import com.bharath.springcloud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {

	private final ProductRepository productRepository;
	private final RestTemplate restTemplate;

	@Autowired
	public ProductRestController(
			ProductRepository productRepository,
			RestTemplate restTemplate
	) {
		this.productRepository = productRepository;
		this.restTemplate = restTemplate;
	}

	@Value("${couponService.url}")
	private String couponServiceURL;

	@PostMapping("/products")
	public Product create(@RequestBody Product product) {
		Coupon coupon = restTemplate.getForObject(couponServiceURL + product.getCouponCode(), Coupon.class);
		product.setPrice(product.getPrice().subtract(Objects.requireNonNull(coupon).getDiscount()));
		return productRepository.save(product);
	}

}