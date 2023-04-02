package com.java8.eg0007;

public class Tester {

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
