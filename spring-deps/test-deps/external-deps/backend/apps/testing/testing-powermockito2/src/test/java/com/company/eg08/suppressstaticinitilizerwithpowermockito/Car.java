package com.company.eg08.suppressstaticinitilizerwithpowermockito;

public class Car extends Vehicle {
	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public boolean start() {
		if (engine.start() == Engine.STARTED_OK) {
			return true;
		}
		return false;
	}
}