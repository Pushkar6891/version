package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;

public class ObjectsTests {

	private static Logger LOG;

	@BeforeAll
	static void beforeAllTests() {

	}

	@AfterAll
	static void afterAllTests() {

	}

	@BeforeEach
	void beforeEveryTest() {

	}

	@AfterEach
	void afterEachTest() {

	}

	@Nested
	@Tag("custom")
	public class IsNull {

		@BeforeEach
		void beforeEveryTest() {

		}

		@AfterEach
		void afterEachTest() {

		}

		@Test
		@Tag("notcustom")
		void isNull_Common_Object_Boolean() {
			Object o = new Object();
			assertEquals(false, Objects.isNull(o));
		}

		@Test
		void isNull_Nullable_Null_Boolean() {
			Object o = null;
			assertNotEquals(false, Objects.isNull(o));
		}

	}

	@Nested
	public class IsNotNull {

		@BeforeEach
		void beforeEveryTest() {

		}

		@AfterEach
		void afterEachTest() {

		}

		@Test
		public void isNotNull_Common_Object_Boolean() {
			Object o = new Object();
			assertEquals(true, Objects.isNotNull(o));
		}

		@Test
		public void isNotNull_Nullable_Null_Boolean() {
			Object o = null;
			assertNotEquals(true, Objects.isNotNull(o));
		}
	}

}