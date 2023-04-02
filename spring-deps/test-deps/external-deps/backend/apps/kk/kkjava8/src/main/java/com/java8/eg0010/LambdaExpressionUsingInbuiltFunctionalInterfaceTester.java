package com.java8.eg0010;

public class LambdaExpressionUsingInbuiltFunctionalInterfaceTester {

	public static void main(String[] args) {

		Runnable runnable = () -> System.out.println("My Task is executing...");
		Thread t1 = new Thread(runnable);
		t1.start();
	}
}
