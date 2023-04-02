package com.java8.eg0050;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {

		Stream<String> onceModifiedStream = Stream.of("abcd", "bbcd", "cbcd").skip(1);
		onceModifiedStream.forEach(System.out::println);
		System.out.println("------------------------------------------------------");

		Stream<String> stream = Stream.of("abc1", "bcd2", "xyz3");
		Stream<String> twiceModifiedStream = stream.skip(1).map(element -> element.substring(0, 3));
		twiceModifiedStream.forEach(System.out::println);

		System.out.println("------------------------------------------------------");
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		long size = list.stream().skip(1).map(element -> element.substring(0, 3)).sorted().count();
		System.out.println(size);

	}

}