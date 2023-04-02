package com.company.junit5.nested;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

class OuterTest {

	@BeforeAll
	static void setUp() {
		System.out.println("Outer class Test data set up is done..");
	}

	@AfterAll
	static void tearDown() {
		System.out.println("Outer class Test data teardown is done..");
	}

	@Test
	void outerTest1() {
		System.out.println("outerTest1");
	}

	@Test
	void outerTest2() {
		System.out.println("outerTest2");
	}

	@Nested
	@TestInstance(Lifecycle.PER_CLASS)
	class innerTest {

		@BeforeAll
		void setUp() {
			System.out.println("Inner class Test data set up is done..");
		}

		@AfterAll
		void tearDown() {
			System.out.println("Inner class Test data teardown is done..");
		}

		@Test
		void innerTest1() {
			System.out.println("innerTest1");
		}

		@Test
		void innerTest2() {
			System.out.println("innerTest2");
		}

		@Test
		void innerTest3() {
			System.out.println("innerTest3");
		}
	}
}