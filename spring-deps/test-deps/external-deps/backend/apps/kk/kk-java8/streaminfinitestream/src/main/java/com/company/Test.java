package com.company;

import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> iterate = Stream.iterate(0, i->i+2);
	//	List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
		List<Integer> collect = iterate.limit(10).toList();
		collect.forEach(System.out::println);
	}

}
