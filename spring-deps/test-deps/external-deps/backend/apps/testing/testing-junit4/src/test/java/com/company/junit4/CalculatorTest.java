package com.company.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.company.junit4.Calculator;

public class CalculatorTest {
	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}
}
