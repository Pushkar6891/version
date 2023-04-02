package com.java8.eg0012;

public class LambdaExpressionUsingCustomFunctionalInterfaceTester {

	public static void main(String[] args) {

		// Using Lambda for Custom Interface
		MyInterface1 myInterface2 = (name) -> System.out
				.println("Your name : " + name + " This method running using Lambda with 1 Parameter");
		myInterface2.m1("Pushkar Chauhan");
	}
}
