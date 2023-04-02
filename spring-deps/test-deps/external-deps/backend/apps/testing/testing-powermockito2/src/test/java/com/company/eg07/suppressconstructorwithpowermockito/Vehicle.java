package com.company.eg07.suppressconstructorwithpowermockito;

public class Vehicle {
	public Vehicle() {
		throw new RuntimeException();
	}

}
