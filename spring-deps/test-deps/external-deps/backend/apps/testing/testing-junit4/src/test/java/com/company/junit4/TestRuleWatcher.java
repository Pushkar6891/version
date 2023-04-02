package com.company.junit4;

import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestRuleWatcher {

	@Rule
	public TestWatcher watchman = new TestWatcher() {
		@Override
		protected void succeeded(Description description) {
			System.out.println("Test succeeded: " + description.getMethodName());
		}

		@Override
		protected void failed(Throwable e, Description description) {
			System.out.println("Test failed: " + description.getMethodName());
		}
	};

	@Test
	@Ignore
	public void redTest() {
		fail();
	}

	@Test
	public void greenTest() {
	}

}
