package com.company.adder.service.task;

import java.util.concurrent.Callable;

import com.company.adder.service.DoubleAdderService;

public class IncerementTask implements Callable<Long> {

	private DoubleAdderService doubleAdderService;
	private long noOfTimes;
	
	public IncerementTask(DoubleAdderService doubleAdderService, long noOfTimes) {
		super();
		this.doubleAdderService = doubleAdderService;
		this.noOfTimes = noOfTimes;
	}


	@Override
	public Long call() throws Exception {
		for (int i = 0; i < noOfTimes; i++) {
			doubleAdderService.increment();
		}
		return doubleAdderService.getValue();
	}

}
