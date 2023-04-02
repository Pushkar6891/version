package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class Eg10EnvironmentVariableConditionsTest {

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
	@EnabledIfEnvironmentVariable(matches = "staging-server", named = "ENV")
	void test_add_two_positive_numbers() {
		int actualResult = myUtils.add(20, 10);
		assertEquals(30, actualResult);
	}

	@Test
	@DisabledIfEnvironmentVariable(named = "ENV", matches = ".*dev.*")
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