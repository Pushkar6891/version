package com.company.client;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.LongAdder;

import com.company.task.MyTask;

public class ClientTester {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		LongAdder adder = new LongAdder();
		MyTask task = new MyTask(10, adder);
		List<Callable<Integer>> tasks = new ArrayList<>();
		tasks.add(task);
		
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		
		List<Future<Integer>> invokeAll = commonPool.invokeAll(tasks);
		for (Future<Integer> future : invokeAll) {
			future.get();
		}
		
		System.out.println(adder.intValue());
		int commonPoolParallelism = ForkJoinPool.getCommonPoolParallelism();
		System.out.println(commonPoolParallelism);
	}
}
