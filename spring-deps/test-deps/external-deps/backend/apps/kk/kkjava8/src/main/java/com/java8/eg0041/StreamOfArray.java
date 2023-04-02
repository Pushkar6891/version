package com.java8.eg0041;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOfArray {

	public static void main(String[] args) {

		Stream<String> streamOfArray = Stream.of("Sachin","Virat","Rahul");
		String[] arr = new String[] {"Sachin","Virat","Rahul"};
		
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr,1,3);
	}

}
