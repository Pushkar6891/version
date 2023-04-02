package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<>();

		integers.add(10);
		integers.add(20);
		integers.add(30);

	//	Integer sum = integers.stream().reduce(100, (x, y) -> x + y);
		Integer sum = integers.stream().reduce(100, Integer::sum);
		System.out.println(sum);

		System.out.println("-------------------------------");

		List<String> list = new ArrayList<>();
		list.add("Sean");
		list.add("Martin");
		list.add("Frank");

	//	List<String> collect = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
	//	List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		List<String> collect = list.stream().map(String::toUpperCase).toList();

		collect.forEach(System.out::println);

	}

}
