package com.company.utility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringUtilityTest {

	private StringUtility obj;

	@BeforeEach
	void setUp() {
		obj = new StringUtility();
	}

	@ParameterizedTest
	@CsvSource(value = { ("abcd,dcba"), ("pqr123,321rqp"), ("@abc,cba@"), (",") })
	void test_reverseStringUsingStringBuilder(String input, String output) {
		assertEquals(output, obj.reverseStringUsingStringBuilder(input));
	}

}
