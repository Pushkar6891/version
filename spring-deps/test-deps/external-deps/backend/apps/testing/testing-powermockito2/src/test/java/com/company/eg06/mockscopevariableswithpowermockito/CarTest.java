package com.company.eg06.mockscopevariableswithpowermockito;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Car.class)
public class CarTest {

	@Test
	public void start_should_return_true_when_engine_ok() throws Exception {
		Engine engine = PowerMockito.mock(Engine.class);

		PowerMock.expectNew(Engine.class).andReturn(engine);
		PowerMock.replay(Engine.class);

		PowerMockito.when(engine.start()).thenReturn(Engine.STARTED_OK);

		Car car = new Car();
		assertTrue(car.start());
	}

}
