package com.java8.eg0021;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Method Referencing using static method
// This is substitute to Lambda
public class Tester {

	public static void main(String[] args) {

		// 1. Before
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		Runnable command = ()->System.out.println("My Task is running..");
//		executorService.execute(command);

		// 2. After
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Runnable command = Tester::myRun;
		executorService.execute(command);

	}

	public static void myRun() {
		System.out.println("My Task is running..");
	}

}
