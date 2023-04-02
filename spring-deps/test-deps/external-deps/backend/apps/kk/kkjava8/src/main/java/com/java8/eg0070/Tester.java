package com.java8.eg0070;

public class Tester {

	public static void main(String[] args) {

		// Using Anonymous Inner Class
		// Runnable is a functional interface
//		Runnable runnable = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("My Task is executing");
//			}
//		};
//
//		Thread t1 = new Thread(runnable);
//		t1.start();

		// Using Lambda Expression to represent Functional Interface
		Runnable runnable = () -> System.out.println("My Task is executing");
		Thread t1 = new Thread(runnable);
		t1.start();
	}

}
