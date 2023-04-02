package com.java8.eg0057;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Tester {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");

		// Lambda using BIConsumer
		BiConsumer<Integer, String> biConsumer = (k, v) -> System.out.println("Key:" + k + "\t" + "Value:" + v);
		// map.forEach((k, v) -> System.out.println("Key:" + k + "\t" + "Value:" + v));

		Map<Integer, Student> stuMap = new HashMap<>();
		stuMap.put(1001, new Student("Martin", 902892892L));
		stuMap.put(1002, new Student("Frank", 5028956592L));

		stuMap.forEach((k, v) -> System.out.println("Key:" + k + "\t" + "Value:" + v));
	}

}