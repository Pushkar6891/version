package com.java8.eg0005;

public class FunctionalInterfaceWithLambdaTester {

	public static void main(String[] args) {

		Runnable runnable = () -> {

			for (int i = 0; i < 10; i++) {
				System.out.println("Thread : " + Thread.currentThread().getName() + " prints " + (i + 1));
			}

		};

		Thread t1 = new Thread(runnable);
		t1.start();
	}

}
