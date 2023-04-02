package com.java8.eg0035;

import java.util.LinkedList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(70);
		list.add(40);

		Integer sum = list.stream().reduce(100, (x, y) -> x + y);
		System.out.println(sum);
	}

}
