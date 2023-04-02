package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTester {

	public static void main(String[] args) {

		m1();
		System.out.println("-------------");
		m2();

	}

	public static void m1() {
		List<String> list = new ArrayList<>();
		list.add("Sean");
		list.add("Martin");
		list.add("Frank");
		list.add("Andrew");

		Stream<String> stream = list.stream();
		System.out.println(stream.count());
		long count = list.stream().distinct().distinct().count();
		System.out.println(count);

		boolean anyMatch = list.stream().anyMatch(s -> s.contains("ra"));
		System.out.println(anyMatch);
	}

	public static void m2() {
		List<String> list = new ArrayList<>();
		list.add("Sean");
		list.add("Martin");
		list.add("Frank");
		list.add("Andrew");

		Stream<String> stream = list.stream();
		Stream<String> distinct = stream.distinct();
		long count = distinct.count();
		System.out.println(count);

		boolean anyMatch = list.stream().anyMatch(s -> s.contains("ra"));
		System.out.println(anyMatch);
	}

}
