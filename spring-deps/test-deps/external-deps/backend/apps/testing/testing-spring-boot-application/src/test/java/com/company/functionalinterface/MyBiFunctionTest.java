package com.company.functionalinterface;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MyBiFunctionTest {

	private MyBiFunction obj;

	@BeforeEach
	void setUp() {
		obj = new MyBiFunction();
	}

	@ParameterizedTest
	@CsvSource({ "1,2,4", "18,10,190" })
	void test_invokeIncrementBy1AndMultiplyByYBiFunction(int firstInput, int secondInput, int expected) {
		assertThat(expected).isEqualTo(obj.invokeIncrementBy1AndMultiplyByYBiFunction(firstInput, secondInput));
	}

}
