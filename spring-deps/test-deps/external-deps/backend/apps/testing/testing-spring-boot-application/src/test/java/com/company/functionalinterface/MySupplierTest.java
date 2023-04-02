package com.company.functionalinterface;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MySupplierTest {

	private MySupplier obj;

	@BeforeEach
	void setUp() {
		obj = new MySupplier();
	}

	@Test
	void test_getDBConnectionUrlSupplier() {
		String expected = "jdbc:mysql://localhost:3306/springbootdb";
		assertThat(expected).isEqualTo(obj.getDBConnectionUrlSupplier());
	}

	@Test
	void test_getFruitsSupplier() {
		assertThat(5).isEqualTo(obj.getFruitsSupplier().size());
	}

	@Test
	void test_getNumberSupplier() {
		assertThat(7).isEqualTo(obj.getNumberSupplier().size());
	}

	@Test
	void test_getMarksSupplier() {
		assertThat(3).isEqualTo(obj.getMarksSupplier().size());
	}

}
