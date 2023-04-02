package com.company.springbootappinterview.corejava.java8features.lambdas.interfaces;

public class MyRunnableImpl implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println("Child Thread");
		}

	}

}
