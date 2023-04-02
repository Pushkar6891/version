package com.company.task;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.LongAdder;

public class MyTask implements Callable<Integer> {

	private int noOfTimes;
	private LongAdder  adder;
	
	public MyTask(int noOfTimes, LongAdder adder) {
		super();
		this.noOfTimes = noOfTimes;
		this.adder = adder;
	}

	@Override
	public Integer call() throws Exception {
		for (long i = 1; i <=noOfTimes; i++) {
			System.out.println(Thread.currentThread().getName());
			adder.add(i);
		}
		return adder.intValue();
	}

}
