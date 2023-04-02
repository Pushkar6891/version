package com.company.mockito.scrapbook;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@SuppressWarnings("deprecation")
public class ATest {

	@Mock
	B b;
	private A a;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
		a = new A(b);
	}

	@Test
	public void usesVoidMethodShoulCallTheVoidMethod() throws Exception {
		doNothing().when(b).voidmethod();
		assertSame(1, a.usesVoidMethod());
		verify(b).voidmethod();
	}

	@Test
	public void usesVoidMethodShouldThrowRuntimeException() throws Exception {
		doThrow(Exception.class).when(b).voidmethod();
		Assertions.assertThrows(RuntimeException.class, () -> {
			a.usesVoidMethod();
		});
	}

	@Test
	public void testConsecutiveCalls() throws Exception {
		doNothing().doThrow(Exception.class).when(b).voidmethod();
		Assertions.assertThrows(RuntimeException.class, () -> {
			a.usesVoidMethod();
			verify(b).voidmethod();
			a.usesVoidMethod();
		});
	}
}
