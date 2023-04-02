package com.company.junit4;

import java.util.ArrayList;

import org.junit.Test;

@SuppressWarnings("unused")
public class ExceptionExpectedTest {
	@Test(expected = ArithmeticException.class)
	public void testDivisionWithException() {
		int i = 1 / 0;
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testEmptyList() {
		new ArrayList<Object>().get(0);
	}
}
