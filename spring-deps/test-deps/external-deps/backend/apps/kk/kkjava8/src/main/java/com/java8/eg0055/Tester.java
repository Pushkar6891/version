package com.java8.eg0055;

import java.util.Optional;

public class Tester {

	public static void main(String[] args) {

		Integer intVal1 = null;
		Integer intVal2 = new Integer(10);

		Optional<Integer> optional1 = Optional.ofNullable(intVal1);
		Optional<Integer> optional2 = Optional.of(intVal2);

		System.out.println(sum(optional1, optional2));
	}

	public static Integer sum(Optional<Integer> optional1, Optional<Integer> optional2) {
		System.out.println("First param is present " + optional1.isPresent());
		System.out.println("Second param is present " + optional2.isPresent());
		Integer value1 = optional1.orElse(new Integer(0));
		Integer value2 = optional2.get();
		return value1 + value2;
	}

}
