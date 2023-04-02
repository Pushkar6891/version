package com.company.junit5.parameterizedTest.csvSource;

import com.company.junit5.example.StringHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CsvSourceDemo {

	@ParameterizedTest
	@CsvSource({
		"car, rac",
		"test, tset"
	})
	public void csvSourceDemoTest(String input, String expect) {
		StringHelper stringHelper = new StringHelper();
		assertEquals(expect, stringHelper.reverse(input));
	}
	
	@ParameterizedTest
	@CsvSource({
		"car, 'my, car'",
		"car, ''",
		"book, "
	})
	public void csvSourceDemoWithSingleQuotes(String first, String second) {
		assertNotNull(first);
		assertNotNull(second);
	}
	
	@ParameterizedTest
	@CsvSource({
		"One, Two"
	})
	public void csvSourceDemoWithIntegers(String first, Integer second) {
		assertNotNull(first);
		assertNotNull(second);
	}
	
}
