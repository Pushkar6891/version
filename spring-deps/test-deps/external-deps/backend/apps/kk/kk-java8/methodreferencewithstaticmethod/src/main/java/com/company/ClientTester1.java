package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTester1 {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Runnable command = ClientTester1::myRun;
		executorService.execute(command);
	}

	private static void myRun(){
		System.out.println("My Task is running");
	}
}
