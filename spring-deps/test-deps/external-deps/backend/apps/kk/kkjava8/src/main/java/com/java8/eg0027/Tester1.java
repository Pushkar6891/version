package com.java8.eg0027;

import java.util.LinkedList;
import java.util.List;

// Handling Unchecked Exception in Lambda
// if any number is 0 we will get Divide By Zero

// This method is ok but loses lambda functionality that it should be shorts
public class Tester1 {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(0);
		numbers.add(25);
		numbers.forEach(i -> {
			try {
				System.out.println(50 / i);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception occurred : " + e.getMessage());
			}
		});

	}

}
