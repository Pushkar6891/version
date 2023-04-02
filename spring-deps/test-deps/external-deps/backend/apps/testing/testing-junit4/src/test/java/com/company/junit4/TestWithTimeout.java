package com.company.junit4;

import org.junit.Ignore;
import org.junit.Test;

public class TestWithTimeout {

	@Test(timeout = 1000)
	@Ignore
	public void test() throws InterruptedException {
		Thread.sleep(2000);
	}

}
