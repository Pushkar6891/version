package com.company.eg06.mockscopevariableswithpowermockito;

public class Engine {
	public final static int STARTED_OK = 1;
	public final static int NOT_STARTED = 2;
	
	public enum Type {
		DIESEL,
		PETROL
	}
	
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

	public static void preHeatEngine() {
		// heating actions here..
		
	}
}
