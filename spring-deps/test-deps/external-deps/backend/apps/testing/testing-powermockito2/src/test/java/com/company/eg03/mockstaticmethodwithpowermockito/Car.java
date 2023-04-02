package com.company.eg03.mockstaticmethodwithpowermockito;

public class Car {
	
	public boolean start() {
		if (Engine.start() == Engine.STARTED_OK) {
			return true;
		}
		return false;
	}
}
