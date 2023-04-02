package com.bharath.springboot.reactive;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bharath.springboot.reactive.vaccine.Vaccine;
import com.bharath.springboot.reactive.vaccine.VaccineController;
import com.bharath.springboot.reactive.vaccine.VaccineService;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
class VaccineControllerTest {
	
	@Autowired
	VaccineController controller;
	
	@MockBean
	VaccineService service;

	@Test
	void testGetVaccines() {
		when(service.getVaccines())
		.thenReturn(Flux.just(new Vaccine("Bharath"), new Vaccine("J&J"), new Vaccine("Covaxin")));
		StepVerifier.create(controller.getVaccines())
					.expectNextCount(3)
					.expectComplete()
					.verify();
		verify(service).getVaccines();

	}
}










