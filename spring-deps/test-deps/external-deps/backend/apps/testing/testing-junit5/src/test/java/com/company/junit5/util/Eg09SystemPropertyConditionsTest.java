package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class Eg09SystemPropertyConditionsTest {

	private static AdditionUtility myUtils;

	@BeforeAll
	static void setUp() {
		myUtils = new AdditionUtility();
		System.out.println("Test data set up is done..");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("@BeforeEach is executed..");
	}

	@Test
	@EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle.*")
	void test_add_two_positive_numbers() {
		int actualResult = myUtils.add(20, 10);
		assertEquals(30, actualResult);
	}

	@Test
	@DisabledIfSystemProperty(named = "ci-server", matches = "true")
	void test_add_two_negative_numbers() {
		int actualResult = myUtils.add(-20, -10);
		assertEquals(-30, actualResult);
	}

	@Test
	void test_add_one_positive_and_one_negative_number() {
		int actualResult = myUtils.add(20, -10);
		assertEquals(10, actualResult);
	}

	@AfterEach
	void afterEach() {
		System.out.println("@AfterEach is executed..");
	}

	@AfterAll
	static void tearDown() {
		myUtils = null;
		System.out.println("Test data teardown is done..");
	}
}