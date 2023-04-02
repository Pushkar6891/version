package com.company.longAccumulator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.function.LongBinaryOperator;

import com.company.task.service.LongAccumulatorTaskService;
import com.company.task.service.impl.LongAccumulatorTaskServiceImpl;

public class LongAccumulatorTest {

	public static void main(String[] args) {
		LongBinaryOperator accumulatorFunction = (x, y) -> x + y;
		LongAccumulator longAccumulator = new LongAccumulator(accumulatorFunction, 0L);

		LongAccumulatorTaskService tasks1 = new LongAccumulatorTaskServiceImpl(longAccumulator, 100L);
		LongAccumulatorTaskService tasks2 = new LongAccumulatorTaskServiceImpl(longAccumulator, 100L);

		List<Callable<Long>> tasks = new ArrayList<>();
		tasks.add(tasks1);
		tasks.add(tasks2);

		try {
			List<Future<Long>> invokeAll = Executors.newFixedThreadPool(2).invokeAll(tasks);

			for (Future<Long> future : invokeAll) {
				future.get();
			}
			System.out.println(longAccumulator.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
