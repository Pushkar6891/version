package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = OrderAnnotation.class)
public class Eg12ExecutionOrderTest {

	private static AdditionUtility myUtils;

	@BeforeAll
	static void setUp() {
		myUtils = new AdditionUtility();
		System.setProperty("ENV", "staging-server");
		System.out.println("Test data set up is done..");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("@BeforeEach is executed..");
	}

	@Test
	@Order(value = 3)
	void test1() {
		int actualResult = myUtils.add(20, 10);
		assertEquals(30, actualResult);
	}

	@Test
	@Order(value = 2)
	void test2() {
		int actualResult = myUtils.add(-20, -10);
		assertEquals(-30, actualResult);
	}

	@Test
	@Order(value = 1)
	void test3() {
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