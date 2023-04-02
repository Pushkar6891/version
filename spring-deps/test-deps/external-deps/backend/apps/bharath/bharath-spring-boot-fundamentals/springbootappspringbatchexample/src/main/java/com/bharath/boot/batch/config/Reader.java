package com.bharath.boot.batch.config;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {

	private int count;
	private String[] courses = { "Java", "Angular", "Python", "C#", "PHP", "Sybase", "Oracle", "MySQL" };

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("Inside read method");
		if (count < courses.length) {
			return courses[count++];
		} else {
			count = 0;
		}

		return null;
	}

}
