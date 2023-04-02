package com.java8.eg0013;

public class LambdaExpressionUsingCustomFunctionalInterfaceTester {

	public static void main(String[] args) {

		// Using Lambda for Custom Interface
		MyInterface1 myInterface2 = (name, age) -> System.out
				.println("Your name : " + name + " and Age: " + age + " This method running using Lambda with 2 Parameter");
		myInterface2.m1("Pushkar Chauhan", 29);
	}
}
