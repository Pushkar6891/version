package com.company.junit5.parameterizedTest.csvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.company.junit5.example.StringHelper;

public class CsvFileSourceDemo {

	@ParameterizedTest
	@CsvFileSource(resources = "/reverse.csv")
	@Disabled
	public void csvFileSourceDemoTest(String input, String expect) {
		StringHelper stringHelper = new StringHelper();
		assertEquals(expect, stringHelper.reverse(input));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/reverse.csv", numLinesToSkip = 1)
	public void csvFileSourceDemoWithNumberOfLinesToSkipTest(String input, String expect) {
		StringHelper stringHelper = new StringHelper();
		assertEquals(expect, stringHelper.reverse(input));
	}
	
}
