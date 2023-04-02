package com.company.junit5.nested;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Nested Tests JUnit 5 Example
 * 
 * @author KK JavaTutorials
 */
@DisplayName("A Stack")
class TestingAStack {

	private Stack<String> stack;

	@Test
	@DisplayName("is instantiated with new Stack()")
	void isInstantiatedWithNew() {
		stack = new Stack<String>();
	}

	@Nested
	@DisplayName("when new")
	class WhenNew {

		@BeforeEach
		void createNewStack() {
			stack = new Stack<>();
		}

		@Test
		@DisplayName("is empty")
		void isEmpty() {
			assertTrue(stack.isEmpty());
		}

		@Test
		@DisplayName("throws EmptyStackException when popped")
		void throwsExceptionWhenPopped() {
			assertThrows(EmptyStackException.class, stack::pop);
		}

		@Test
		@DisplayName("throws EmptyStackException when peeked")
		void throwsExceptionWhenPeeked() {
			assertThrows(EmptyStackException.class, stack::peek);
		}

		@Nested
		@DisplayName("after pushing an element")
		class AfterPushing {

			String element = "KK JavaTutorials";

			@BeforeEach
			void pushAnElement() {
				stack.push(element);
			}

			@Test
			@DisplayName("it is no longer empty")
			void isNotEmpty() {
				assertFalse(stack.isEmpty());
			}

			@Test
			@DisplayName("returns the element when popped and is empty")
			void returnElementWhenPopped() {
				assertEquals(element, stack.pop());
				assertTrue(stack.isEmpty());
			}

			@Test
			@DisplayName("returns the peek element but remains not empty")
			void returnElementWhenPeeked() {
				assertEquals(element, stack.peek());
				assertFalse(stack.isEmpty());
			}
		}
	}
}