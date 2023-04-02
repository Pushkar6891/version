package com.company.eg04.partialmockingusingspywithpowermockito;

public class Car {
	
	public boolean start() {
		if (getEngineType().equals(Engine.Type.DIESEL) && isVeryLowTempOutside()) {
			Engine.preHeatEngine();
		}
		if (Engine.start() == Engine.STARTED_OK) {
			return true;
		}
		return false;
	}
	
	private boolean isVeryLowTempOutside() {
		// checking outside sensors ..etc
		return false;
	}

	public Engine.Type getEngineType() {
		// reading from a file
		return null;
	}
}
