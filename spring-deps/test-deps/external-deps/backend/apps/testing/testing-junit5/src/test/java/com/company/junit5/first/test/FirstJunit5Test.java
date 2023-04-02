package com.company.junit5.first.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstJunit5Test {

	@Test
	@Disabled
	void test() {
		fail();
	}

}
