package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Eg01AdditionUtilityTest {

	@Test
	void addTest() {
		AdditionUtility additionUtility = new AdditionUtility();
		assertEquals(10, additionUtility.add(6, 4));
	}
}
