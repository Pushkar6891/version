package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ClientTester4 {

	public static void main(String[] args) {
		BiFunction<String, String, String> biFunction = (s1, s2) -> getFullName(s1, s2);

		String fullName = biFunction.apply("Sean", "Murphy");
		System.out.println(fullName);

		System.out.println("------------------");

		Function<String, String> function = s -> "Hi, " + s;
		String apply = function.apply("Sean");
		System.out.println(apply);

	}

	private static String getFullName(String s1, String s2) {
		String firstName = s1.toUpperCase();
		String lastName = s2.toUpperCase();
		String result = firstName + "\t" + lastName;
		return result;
	}

}
