package com.bharath.springdatajpa;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bharath.springdatajpa.coupon.entities.Coupon;
import com.bharath.springdatajpa.coupon.repos.CouponRepo;
import com.bharath.springdatajpa.product.entities.Product;
import com.bharath.springdatajpa.product.repos.ProductRepo;

@SpringBootTest
class MultipledatasourcesApplicationTests {

	@Autowired
	CouponRepo couponRepo;

	@Autowired
	ProductRepo productRepo;

	@Test
	void testSaveCoupon() {
		Coupon coupon = new Coupon();
		coupon.setCode("SUPERSALE");
		coupon.setDiscount(new BigDecimal(20));
		coupon.setExpDate("22/22/2022");
		System.out.println(couponRepo.save(coupon));
	}

	@Test
	void testSaveProduct() {
		Product product = new Product();
		product.setName("MAC BOOK PRO");
		product.setDescription("Its Cool");
		product.setPrice(new BigDecimal(2000));
		product.setCouponCode("SUPERSALE");
		System.out.println(productRepo.save(product));
	}

}
