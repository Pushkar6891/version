package com.company.eg01.mockinstancemethodwithoutpowermockito;

public class Engine {
	public final static int STARTED_OK = 1;
	public final static int NOT_STARTED = 2;
	
	public int start() {
		if (areAllComponentsOk()) {
			return STARTED_OK;
		}
		return NOT_STARTED;
	}

	private boolean areAllComponentsOk() {
		// lots of code...
		if (1==1) {
			throw new RuntimeException("Some exception message");
		}
		return false;
	}
}
