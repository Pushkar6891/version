package com.java8.eg0009;

public class Tester {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		t1.start();
	}
}
