package com.company.eg02.mockinstancemethodwithpowermockito;

import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {

	@Test
	void start_should_return_true_when_engine_ok() {
		Engine engineMock = PowerMockito.mock(Engine.class);
		PowerMockito.when(engineMock.start()).thenReturn(Engine.STARTED_OK);
		Car car = new Car(engineMock);
		assertTrue(car.start());
	}

}