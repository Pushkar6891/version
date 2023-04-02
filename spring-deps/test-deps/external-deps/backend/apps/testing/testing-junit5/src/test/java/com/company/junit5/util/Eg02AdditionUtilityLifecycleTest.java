package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Eg02AdditionUtilityLifecycleTest {
	
	private static AdditionUtility myUtils;

	@BeforeAll
	static void setUp() {
		System.out.println("Test data set up..");
		myUtils = new AdditionUtility();
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("@BeforeEach executed");
	}

	@Test
	void addPositiveNumbersTest() {
		System.out.println("addPositiveNumbersTest Method..");
		assertEquals(10, myUtils.add(6, 4));
	}

	@Test
	void addNegativeNumbersTest() {
		System.out.println("addNegativeNumbersTest Method..");
		assertEquals(-10, myUtils.add(-6, -4));
	}

	@AfterAll
	static void tearDown() {
		System.out.println("Test data tearDown..");
		myUtils = null;
	}

	@AfterEach
	void afterEach() {
		System.out.println("@AfterEach executed");
	}
}
