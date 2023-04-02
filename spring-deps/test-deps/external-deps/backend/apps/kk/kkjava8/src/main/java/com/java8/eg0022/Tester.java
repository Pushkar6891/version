package com.java8.eg0022;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

// Method Referencing using constructor
// This is substitute to Lambda
public class Tester {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<>();
		numbers.add(100);
		numbers.add(144);
		numbers.add(196);
		numbers.add(16);
		numbers.add(4);
		
		System.out.println("1. Numbers : ");
		numbers.forEach(System.out::println);

		List<Double> squareRootList = Tester.getSquareRoot(numbers, Integer::new);

		System.out.println("\n2. Square Roots");
		squareRootList.forEach(System.out::println);

	}

	public static List<Double> getSquareRoot(List<Integer> numbers, Function<Integer, Integer> f) {
		List<Double> squareRootList = new LinkedList<>();
		numbers.forEach(e -> squareRootList.add(Math.sqrt(f.apply(e))));
		return squareRootList;
	}

}
