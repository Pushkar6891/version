package com.company.junit4;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCategories {

	@Category(FunctionalTests.class)
	@Test
	public void test1() {
	}

	@Category(NonFunctionalTests.class)
	@Test
	public void test2() {
	}

}
