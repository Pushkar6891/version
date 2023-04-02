package com.company.task;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulatorServicerTask implements Callable<Double> {

	private DoubleAccumulator doubleAccumulator;
	private long noOfTimes;
	
	public DoubleAccumulatorServicerTask(DoubleAccumulator doubleAccumulator, long noOfTimes) {
		super();
		this.doubleAccumulator = doubleAccumulator;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Double call() throws Exception {
		for (int i = 1; i <= noOfTimes; i++) {
			System.out.println(Thread.currentThread().getName());
			doubleAccumulator.accumulate(10.0);
		}
		return doubleAccumulator.get();
	}
}
