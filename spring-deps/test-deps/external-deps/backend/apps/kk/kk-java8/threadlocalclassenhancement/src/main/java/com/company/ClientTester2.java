package com.company;

public class ClientTester2 {

	public static void main(String[] args) {
		ThreadLocalDemo2 demo = new ThreadLocalDemo2();
		Thread thread1 = new Thread(demo, "Thread-1");
		Thread thread2 = new Thread(demo, "Thread-2");

		thread1.start();
		thread2.start();
	}
}