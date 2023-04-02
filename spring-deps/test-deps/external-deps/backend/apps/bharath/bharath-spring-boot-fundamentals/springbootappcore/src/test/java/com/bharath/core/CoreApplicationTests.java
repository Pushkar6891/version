package com.bharath.core;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.core.service.PaymentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreApplicationTests {
	
	@Autowired
	PaymentService paymentService;
	

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testDependencyInjection() {
		assertNotNull(paymentService);
		assertNotNull(paymentService.doPayment());
	}

}
