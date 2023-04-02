package com.java8.eg0072;

import java.util.function.BiFunction;

public class Tester {

	public static void main(String[] args) {

		printFullNameOldWay();
		printFullNameNewWay();

	}

	public static void printFullNameOldWay() {
		BiFunction<String, String, String> biFunction = (String s1, String s2) -> {
			String firstName = s1.toUpperCase();
			String lastName = s2.toLowerCase();
			String fullName = firstName + " " + lastName;
			return fullName;
		};

		String fullName = biFunction.apply("Virat", "Kohli");
		System.out.println(fullName);
	}

	// Type Inference
	public static void printFullNameNewWay() {
		BiFunction<String, String, String> biFunction = (s1, s2) -> getFullName(s1, s2);

		String fullName = biFunction.apply("Virat", "Kohli");
		System.out.println(fullName);
	}

	public static String getFullName(String s1, String s2) {
		return s1.toUpperCase() + " " + s2.toLowerCase();
	}

}
