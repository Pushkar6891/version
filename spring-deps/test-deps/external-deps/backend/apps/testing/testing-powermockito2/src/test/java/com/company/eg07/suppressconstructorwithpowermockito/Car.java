package com.company.eg07.suppressconstructorwithpowermockito;

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