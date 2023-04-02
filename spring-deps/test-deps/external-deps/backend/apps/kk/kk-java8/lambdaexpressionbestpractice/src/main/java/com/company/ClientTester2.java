package com.company;

public class ClientTester2 {

	public static void main(String[] args) {

		m1BadApproachUsingAnonymousClass();
		m2GoodApproachUsingLambda();
	}

	private static void m1BadApproachUsingAnonymousClass() {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("My Task using anonymous class");

			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

	private static void m2GoodApproachUsingLambda() {

		Runnable runnable = () -> System.out.println("My Task using lambda expression");
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
