package com.company.adder.task;

import java.util.concurrent.Callable;

import com.company.adder.service.LongAdderService;

public class DecrementTask implements Callable<Long> {

	private LongAdderService longAdderService;
	private long noOftimes;
	
	public DecrementTask(LongAdderService longAdderService, long noOftimes) {
		super();
		this.longAdderService = longAdderService;
		this.noOftimes = noOftimes;
	}

	@Override
	public Long call() throws Exception {
		for (int i = 0; i < noOftimes; i++) {
			longAdderService.decrement();
		}
		return longAdderService.getValue();
	}

}
