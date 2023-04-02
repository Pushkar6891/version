package com.company;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientTester2 {

	public static void main(String[] args) {

		m1();
		System.out.println("-----------------------------");
		m2();

	}

	public static void m1() {
		Stream<String> stream = Stream.of("a", "b", "c").filter(e -> e.contains("b"));
		Optional<String> findAny = stream.findAny();
		System.out.println(findAny.get());
	//	Optional<String> findFirst = stream.findFirst();
	//	System.out.println(findFirst.get());
	}

	public static void m2() {
		List<String> collect = Stream.of("a", "b", "c").filter(e -> e.contains("b")).collect(Collectors.toList());

		Optional<String> findAny = collect.stream().findAny();
		System.out.println(findAny.get());

		Optional<String> findFirst = collect.stream().findFirst();
		System.out.println(findFirst.get());
	}

}
