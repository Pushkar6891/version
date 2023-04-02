package com.company.dto;

import com.company.dto.OrderRequest.OrderRequestBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class OrderRequestTest {

	private OrderRequest obj1;
	private OrderRequest obj2;

	@BeforeEach
	void setUp() {
		obj1 = new OrderRequest(1, "IPhone 13", 1, 1500, "pushkar.chauhan@yahoo.com", false);
		obj2 = new OrderRequest(1, "IPhone 13", 1, 1500, "pushkar.chauhan@yahoo.com", false);
	}

	@Test
	void test_obj() {
		assertNotNull(obj1);
		assertNotNull(obj2);
	}

	@Test
	void test_builder() {
		OrderRequestBuilder orderRequestBuilder1 = OrderRequest.builder();
		OrderRequestBuilder orderRequestBuilder2 = OrderRequest.builder();
		OrderRequest orderRequest1 = orderRequestBuilder1.id(10)
												 .name("Xiaomi Redmi 10")
												 .quantity(1)
												 .price(100)
												 .emailId("pushkar.chauhan@gmail.com")
												 .isDiscountable(false)
												 .build();
		OrderRequest orderRequest2 = orderRequestBuilder2.id(20)
												 .name("Realme 8")
												 .quantity(1)
												 .price(200)
												 .emailId("pushkar.chauhan@gmail.com")
												 .isDiscountable(true)
												 .build();
		assertNotNull(orderRequest1);
		assertNotNull(orderRequest2);
		assertNotNull(orderRequestBuilder1.toString());
		assertNotNull(orderRequestBuilder2.toString());
	}

	@Test
	void test_toString() {
		OrderRequest orderRequest = new OrderRequest();
		orderRequest.setId(3);
		orderRequest.setName("Samsung Galaxy 10");
		orderRequest.setEmailId("pushkar.chauhan@yahoo.com");
		orderRequest.setQuantity(1);
		orderRequest.setPrice(2000);
		orderRequest.setDiscountable(false);
		assertNotNull(orderRequest.toString());
		assertNotNull(obj1.toString());
		assertNotNull(obj2.toString());
	}
}
