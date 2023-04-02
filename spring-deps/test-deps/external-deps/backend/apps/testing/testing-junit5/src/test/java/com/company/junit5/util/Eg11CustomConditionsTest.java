package com.company.junit5.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

public class Eg11CustomConditionsTest {

	@Test
	@EnabledIf("customCondition")
	void enabled() {
		System.out.println("enabled:Test execution depends on customCondition");
	}

	@Test
	@DisabledIf("customCondition")
	void disabled() {
		System.out.println("disabled:Test execution depends on customCondition");
	}

	boolean customCondition() {
		return true;
	}
}