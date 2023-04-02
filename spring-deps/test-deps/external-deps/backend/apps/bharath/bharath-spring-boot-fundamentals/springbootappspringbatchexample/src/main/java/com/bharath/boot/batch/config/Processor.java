package com.bharath.boot.batch.config;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {

	@Override
	public String process(String item) throws Exception {
		System.out.println("Inside process method");
		return "Processed : " + item.toUpperCase();
	}

}
