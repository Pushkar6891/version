package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClientTester {

	public static void main(String[] args) {

		System.out.println("Creating Thread using Anonymous Class: ");
		createThreadUsingAnonymousClass();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("-----------------------------------");
		System.out.println("Creating Thread using Lambda Expression: ");
		createThreadUsingLamdaExpression();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("-----------------------------------");
		List<String> nameList = new ArrayList<>();
		nameList.add("Andrew");
		nameList.add("Sean");
		nameList.add("Rocky");

		System.out.println("List of Names:");
		nameList.forEach((name) -> System.out.println(name));
		System.out.println("-----------------------------------");
		System.out.println("List of Names:");
		nameList.forEach(System.out::println);

	}

	private static void createThreadUsingLamdaExpression() {
		Runnable r = () -> {
			System.out.println("My task is executing using Lambda Expression..");
		};
		Thread thread = new Thread(r);
		thread.start();
	}

	private static void createThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("My task is executing using Anonymous Class..");
			}
		};

		Thread thread = new Thread(r);
		thread.start();
	}
}
