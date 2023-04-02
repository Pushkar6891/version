package com.company.dto;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.dto.OrderRequest.OrderRequestBuilder;

class OrderResponseTest {

	private OrderRequest orderRequest1;
	private OrderRequest orderRequest2;

	private OrderResponse orderResponse1;
	private OrderResponse orderResponse2;

	@BeforeEach
	void setUp() {
		orderRequest1 = new OrderRequest();
		orderRequest1.setId(3);
		orderRequest1.setName("Samsung Galaxy 10");
		orderRequest1.setEmailId("pushkar.chauhan@yahoo.com");
		orderRequest1.setQuantity(1);
		orderRequest1.setPrice(2000);
		orderRequest1.setDiscountable(false);

		orderRequest2 = new OrderRequest();
		orderRequest2.setId(4);
		orderRequest2.setName("Samsung Galaxy 10");
		orderRequest2.setEmailId("pushkar.chauhan@yahoo.com");
		orderRequest2.setQuantity(1);
		orderRequest2.setPrice(2000);
		orderRequest2.setDiscountable(false);

		orderResponse1 = new OrderResponse();
		orderResponse1.setResponse(orderRequest1);
		orderResponse1.setMessage("Dummy");
		orderResponse1.setStatusCode(200);

		orderResponse2 = new OrderResponse();
		orderResponse2.setResponse(orderRequest2);
		orderResponse2.setMessage("Dummy");
		orderResponse2.setStatusCode(200);

		orderResponse1 = new OrderResponse(orderRequest1, "Dummy", 100);
		orderResponse2 = new OrderResponse(orderRequest2, "Dummy", 100);

	}

	@Test
	void test_obj() {
		assertNotNull(orderRequest1);
		assertNotNull(orderRequest2);
		assertNotNull(orderResponse1);
		assertNotNull(orderResponse2);
	}

	@Test
	void test_builder() {
		OrderRequestBuilder orderRequestBuilder1 = OrderRequest.builder();
		OrderRequestBuilder orderRequestBuilder2 = OrderRequest.builder();
		OrderRequest orderRequest1 = orderRequestBuilder1.id(10).name("Xiaomi Redmi 10").quantity(1).price(100)
				.emailId("pushkar.chauhan@gmail.com").isDiscountable(false).build();
		OrderRequest orderRequest2 = orderRequestBuilder2.id(20).name("Realme 8").quantity(1).price(200)
				.emailId("pushkar.chauhan@gmail.com").isDiscountable(true).build();

		OrderResponse orderResponse1 = new OrderResponse();
		orderResponse1.setResponse(orderRequest1);
		orderResponse1.setMessage("Dummy");
		orderResponse1.setStatusCode(200);

		OrderResponse orderResponse2 = new OrderResponse();
		orderResponse2.setResponse(orderRequest2);
		orderResponse2.setMessage("Dummy");
		orderResponse2.setStatusCode(200);

		assertNotNull(orderRequest1);
		assertNotNull(orderRequest2);

		assertNotNull(orderResponse1);
		assertNotNull(orderResponse2);

		assertNotNull(orderRequestBuilder1.toString());
		assertNotNull(orderRequestBuilder2.toString());
	}

	@Test
	void test_toString() {

		assertNotNull(orderRequest1.toString());
		assertNotNull(orderRequest2.toString());

		assertNotNull(orderResponse1.toString());
		assertNotNull(orderResponse2.toString());

	}
}
