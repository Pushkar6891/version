package com.company.functionalinterface;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MyFunctionTest {

	private MyFunction obj;

	@BeforeEach
	void setUp() {
		obj = new MyFunction();
	}

	@ParameterizedTest
	@CsvSource({ "10,11", "-10,-9", "0,1", "-1,0", "-2,-1" })
	void test_invokeIncrementByOneFunction(int input, int expected) {
		assertThat(expected).isEqualTo(obj.invokeIncrementByOneFunction(input));
	}

	@ParameterizedTest
	@CsvSource({ "10,100", "-10,-100", "2,20" })
	void test_invokeMultiplByTenFunction(int input, int expected) {
		assertThat(expected).isEqualTo(obj.invokeMultiplByTenFunction(input));
	}

	@ParameterizedTest
	@CsvSource({ "13,140", "10,110", "-6,-50" })
	void test_invokeAddByNandThenMultiplyByNFunction(int input, int expected) {
		assertThat(expected).isEqualTo(obj.invokeAddByNandThenMultiplyByNFunction(input));
	}

}
