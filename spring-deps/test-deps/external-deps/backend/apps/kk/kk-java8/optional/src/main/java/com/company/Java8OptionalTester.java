package com.company;

import java.util.Optional;

public class Java8OptionalTester {

	public static void main(String[] args) {
		Integer value1 = null;
		Integer value2 = new Integer(10);
		Optional<Integer> a = Optional.ofNullable(value1);
		Optional<Integer> b = Optional.of(value2);
		Integer sum = sum(a, b);
		System.out.println(sum);

	}

	private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First Parameter is Present:" + a.isPresent());
		System.out.println("Second Parameter is Present:" + b.isPresent());
		Integer value1 = a.orElse(new Integer(0));
		Integer value2 = b.get();
		return value1 + value2;
	}

}
