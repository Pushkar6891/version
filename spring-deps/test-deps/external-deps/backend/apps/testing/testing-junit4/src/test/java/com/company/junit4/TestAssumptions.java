package com.company.junit4;

import static org.junit.Assume.assumeFalse;

import org.junit.Test;

public class TestAssumptions {

	@Test
	public void assumptionTest() {
		assumeFalse(true);
		// This test will be skipped
	}

}
