package com.company.task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.function.DoubleBinaryOperator;

public class DoubleAccumulatorTest {

	public static void main(String[] args) {

		DoubleBinaryOperator accumulatorFunction=(x,y)->x+y;
		DoubleAccumulator doubleAccumulator = new DoubleAccumulator(accumulatorFunction, 5.0);
		
		DoubleAccumulatorServicerTask task1 = new DoubleAccumulatorServicerTask(doubleAccumulator, 10000L);
		DoubleAccumulatorServicerTask task2 = new DoubleAccumulatorServicerTask(doubleAccumulator, 10000L);
		
		List<Callable<Double>> tasks = new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		
		try {
			List<Future<Double>> invokeAll = Executors.newFixedThreadPool(2).invokeAll(tasks);
			
			for (Future<Double> future : invokeAll) {
				future.get();
			}
			double finalResult = doubleAccumulator.get();
			System.out.println(finalResult);
			float finalResultinFloat = doubleAccumulator.floatValue();
			System.out.println(finalResultinFloat);
			//doubleAccumulator.reset();
			//System.out.println(doubleAccumulator.get());
			
			System.out.println(doubleAccumulator.getThenReset());
			System.out.println(doubleAccumulator.get());
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}

}
