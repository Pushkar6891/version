package com.bharath.boot.batch.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> items) throws Exception {
		System.out.println("Inside write method");
		System.out.println("Writing Data to console : " + items);
	}

}
