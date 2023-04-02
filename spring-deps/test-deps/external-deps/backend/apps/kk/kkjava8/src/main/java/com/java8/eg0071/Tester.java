package com.java8.eg0071;

import java.util.function.BiFunction;

public class Tester {

	public static void main(String[] args) {

		printFullNameLengthOldWay();
		printFullNameLengthNewWay();

		printFullNameOldWay();
		printFullNameNewWay();

	}

	public static void printFullNameLengthOldWay() {
		BiFunction<String, String, Integer> biFunction = (s1, s2) -> {
			int fullLength = s1.length() + s2.length();
			return fullLength;
		};

		Integer fullLength = biFunction.apply("Virat", "Kohli");
		System.out.println(fullLength);
	}

	public static void printFullNameLengthNewWay() {
		BiFunction<String, String, Integer> biFunction = (s1, s2) -> getFullNameLength(s1, s2);

		Integer fullLength = biFunction.apply("Virat", "Kohli");
		System.out.println(fullLength);
	}

	public static int getFullNameLength(String s1, String s2) {
		return s1.length() + s2.length();
	}

	public static void printFullNameOldWay() {
		BiFunction<String, String, String> biFunction = (s1, s2) -> {
			String firstName = s1.toUpperCase();
			String lastName = s2.toLowerCase();
			String fullName = firstName + " " + lastName;
			return fullName;
		};

		String fullName = biFunction.apply("Virat", "Kohli");
		System.out.println(fullName);
	}

	public static void printFullNameNewWay() {
		BiFunction<String, String, String> biFunction = (s1, s2) -> getFullName(s1, s2);

		String fullName = biFunction.apply("Virat", "Kohli");
		System.out.println(fullName);
	}

	public static String getFullName(String s1, String s2) {
		return s1.toUpperCase() + " " + s2.toLowerCase();
	}

}
