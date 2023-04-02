package com.java8.eg0040;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfCollection {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Sachin","Virat","Rahul");
		Stream<String> stream = list.stream();
	}

}
