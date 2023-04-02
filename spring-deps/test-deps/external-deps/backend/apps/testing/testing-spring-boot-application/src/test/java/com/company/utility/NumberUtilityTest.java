package com.company.utility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(OrderAnnotation.class)
class NumberUtilityTest {

	private NumberUtility obj;

	@BeforeEach
	void setUp() {
		obj = new NumberUtility();
	}

	@ParameterizedTest
	@CsvSource(value = { "test:test", "tEst:test", "Java:java" }, delimiter = ':')
	void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
		String actualValue = input.toLowerCase();
		assertEquals(expected, actualValue);
	}

	@ParameterizedTest
	@CsvSource(value = { "2:true", "3:true", "4:false", "8:false", "98:false", "13:true" }, delimiter = ':')
	void checkPrime(int input, String expected) {
		boolean expectedResult = Boolean.parseBoolean(expected);
		assertEquals(expectedResult, obj.isPrime(input));
	}
	
	@ParameterizedTest
	@CsvSource(value = { "123:321", "-134:-431" }, delimiter = ':')
	void reverseNumber(int input, String expected) {
		int expectedResult = Integer.parseInt(expected);
		assertEquals(expectedResult, obj.reverseNumber(input));
	}

}
