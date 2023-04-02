package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "All the Test Cases of Eg05AssumptionsTest")
class Eg05AssumptionsTest {

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
	@DisplayName(value = "adding two positive numbers")
	void test_add_two_positive_numbers() {
		System.setProperty("ENV", "DEV");
		assumeTrue("DEV".equals(System.getProperty("ENV")));

		// If above assumption is true then rest of test will proceed
		int actualResult = myUtils.add(20, 10);
		assertEquals(30, actualResult);
	}

	@Test
	@DisplayName(value = "adding two negative numbers")
	void test_add_two_negative_numbers() {

		System.setProperty("ENV", "PROD");
		assumeTrue("DEV".equals(System.getProperty("ENV")), Eg05AssumptionsTest::message);

		int actualResult = myUtils.add(-20, -10);
		assertEquals(-30, actualResult);
	}

	@Test
	@DisplayName(value = "adding one positive and one negative number")
	void test_add_one_positive_and_one_negative_number() {

		System.setProperty("ENV", "DEV");
		assumeFalse("DEV".equals(System.getProperty("ENV")), Eg05AssumptionsTest::message);

		// If above assumption is false then rest of test will be aborted
		int actualResult = myUtils.add(20, -10);
		assertEquals(10, actualResult);
	}

	@Test
	@DisplayName(value = "adding one two numbers")
	void testInAllEnvironments() {
		System.setProperty("ENV", "CI");
		assumingThat("CI".equals(System.getenv("ENV")), () -> {
			// This assertion only perform on the CI server
			assertEquals(60, myUtils.add(40, 20));
		});

		// perform these assertions in all environments
		assertEquals(130, myUtils.add(60, 70));
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

	private static String message() {
		return "Test Execution is Failed. ";
	}
}