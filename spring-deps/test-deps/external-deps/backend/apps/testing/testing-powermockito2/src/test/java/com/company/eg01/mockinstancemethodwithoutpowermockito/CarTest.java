package com.company.eg01.mockinstancemethodwithoutpowermockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {

	@Test
	void start_should_return_true_when_engine_ok() {
		EngineMock engine = new EngineMock();
		engine.setReturnValue(Engine.STARTED_OK);
		Car car = new Car(engine);
		assertTrue(car.start());
	}

}
