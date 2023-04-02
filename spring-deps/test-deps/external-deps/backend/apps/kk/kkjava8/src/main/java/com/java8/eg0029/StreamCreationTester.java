package com.java8.eg0029;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationTester {

	public static void main(String[] args) {

		System.out.println("1. Using Arrays.stream(arr)");		
		String[] arr = new String[] { "Sachin", "Virat", "Rahul" };
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(System.out::println);
		
		
		System.out.println("\n2. Using Stream.of(varargs...)");
		Stream<String> stream2 = Stream.of("Sachin","Virat","Rahul");
		stream2.forEach(System.out::println);
		
		System.out.println("\n3. Creating stream from collection using list.stream()");
		List<String> list = new LinkedList<>();
		list.add("Sachin");
		list.add("Virat");
		list.add("Rahul");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);
	}

}
