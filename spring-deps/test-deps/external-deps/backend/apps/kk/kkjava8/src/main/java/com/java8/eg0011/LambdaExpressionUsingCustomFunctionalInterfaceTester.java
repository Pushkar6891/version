package com.java8.eg0011;

public class LambdaExpressionUsingCustomFunctionalInterfaceTester {

	public static void main(String[] args) {

		// Using Anonymous Class for Custom Interface
		MyInterface1 myInterface1 = new MyInterface1() {

			@Override
			public void m1() {
				System.out.println("This method running using Lambda with 0 Parameters");
			}
		};

		myInterface1.m1();

		// Using Lambda for Custom Interface
		MyInterface1 myInterface2 = () -> System.out.println("This method running using Lambda with 0 Parameters");
		myInterface2.m1();
	}
}
