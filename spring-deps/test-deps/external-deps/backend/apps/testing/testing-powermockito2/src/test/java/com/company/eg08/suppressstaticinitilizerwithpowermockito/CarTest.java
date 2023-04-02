package com.company.eg08.suppressstaticinitilizerwithpowermockito;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@SuppressStaticInitializationFor("com.company.eg08.suppressstaticinitilizerwithpowermockito.Vehicle")
public class CarTest {
	
	@Test
	public void start_should_return_true_when_engine_ok() throws Exception {
		Engine engine = PowerMockito.mock(Engine.class);
		PowerMockito.when(engine.start()).thenReturn(Engine.STARTED_OK);
		Car car = new Car(engine);
		assertTrue(car.start());
	}

}
