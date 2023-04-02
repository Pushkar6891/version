package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Dependency Injection for Constructors and Methods")
public class DIForConstructorAndMethodTest {

	private static AdditionUtility myUtils;

	public DIForConstructorAndMethodTest(TestInfo testInfo) {
		System.out.println("Inside DIForConstructorAndMethodTest Constructor..");
		String displayName = testInfo.getDisplayName();
		assertEquals("Dependency Injection for Constructors and Methods", displayName);
	}

	@BeforeAll
	static void setUp(TestInfo testInfo) {
		myUtils = new AdditionUtility();
		System.out.println("Test data set up is done..");
		// System.out.println(testInfo.getTags());
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("@BeforeEach is executed..");
	}

	@Test
	@Tag(value = "tag_1")
	@DisplayName(value = "adding two positive numbers")
	void test_add_two_positive_numbers(TestInfo testInfo) {
		int actualResult = myUtils.add(20, 10);
		assertEquals(30, actualResult);
		Set<String> tags = testInfo.getTags();
		System.out.println(tags);
		assertTrue(tags.contains("tag_1"));
	}

	@Test
	@Tag(value = "tag_2")
	@DisplayName(value = "adding two negtaive numbers")
	void test_add_two_negative_numbers(TestInfo testInfo) {
		int actualResult = myUtils.add(-20, -10);
		assertEquals(-30, actualResult);
	}

	@Test
	@DisplayName(value = "adding one positive and one negative number")
	void test_add_one_positive_and_one_negative_number() {
		int actualResult = myUtils.add(20, -10);
		assertEquals(10, actualResult);
	}

	@AfterEach
	void afterEach() {
		System.out.println("@AfterEach is executed..");
	}

	@AfterAll
	static void tearDown(TestInfo testInfo) {
		myUtils = null;
		System.out.println("Test data teardown is done..");
		// System.out.println(testInfo.getTags());
	}
}