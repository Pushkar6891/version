package com.company.eg06.mockscopevariableswithpowermockito;

public class Car {
	
	public boolean start() {
		Engine engine = new Engine();
		if (engine.start() == Engine.STARTED_OK) {
			return true;
		}
		return false;
	}
}