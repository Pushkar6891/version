package com.company;

public class ClientTester {

	public static void main(String[] args) {

		System.out.println("Creating Thread without using Lambda Expression: ");
		createThreadWithoutLambda();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("-----------------------------------");
		System.out.println("Creating Thread with using Lambda Expression: ");
		createThreadUsingLambda();
	}

	private static void createThreadUsingLambda() {
		Runnable r = () -> System.out.println("My is executing..");
		Thread thread1 = new Thread(r);
		thread1.start();
	}

	private static void createThreadWithoutLambda() {
		MyThread myThread = new MyThread();
		Thread thread1 = new Thread(myThread);
		thread1.start();
	}

}
