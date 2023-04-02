package com.company.eg01.mockinstancemethodwithoutpowermockito;

public class Car {
	private Engine engine;
	public Car(Engine engineObj) {
		this.engine = engineObj;
	}
	
	public boolean start() {
		if (engine.start() == Engine.STARTED_OK) {
			return true;
		}
		return false;
	}
}
