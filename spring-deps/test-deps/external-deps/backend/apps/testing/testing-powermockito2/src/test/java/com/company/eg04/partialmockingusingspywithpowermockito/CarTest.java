package com.company.eg04.partialmockingusingspywithpowermockito;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertTrue;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Engine.class)
public class CarTest {

	@Test
	@Ignore
	public void start_should_return_true_when_engine_ok() {
		PowerMockito.mockStatic(Engine.class);
		PowerMockito.when(Engine.start()).thenReturn(Engine.STARTED_OK);
		Car car = PowerMockito.spy(new Car());
		PowerMockito.when(car.getEngineType()).thenReturn(Engine.Type.DIESEL);
		assertTrue(car.start());
	}

}
