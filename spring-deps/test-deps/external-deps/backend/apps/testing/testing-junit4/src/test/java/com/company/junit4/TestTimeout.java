package com.company.junit4;

import org.junit.Ignore;
import org.junit.Test;

public class TestTimeout {

	@Test(timeout = 10)
	@Ignore
	public void test() {
		while (true)
			;
	}

}
