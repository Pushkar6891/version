package com.company.eg08.suppressstaticinitilizerwithpowermockito;


public class Vehicle {
	static {
		if (true) {
			throw new RuntimeException("Code breaks due some strange problem.");
		}
	}
	public Vehicle() {
		//throw new RuntimeException();
	}

}
