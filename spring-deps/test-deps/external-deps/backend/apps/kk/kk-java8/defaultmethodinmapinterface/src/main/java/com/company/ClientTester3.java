package com.company;

import java.util.HashMap;
import java.util.Map;

public class ClientTester3 {

	public static void main(String[] args) {

		Map<Integer, String> empMap = new HashMap<>();
		empMap.put(20, "Author-A");
		empMap.put(10, "Author-B");
		empMap.put(30, "Author-C");

		boolean remove = empMap.remove(10, "Author-B");
		System.out.println(remove);

		empMap.forEach((k, v) -> System.out.println(k + "\t" + v));

		System.out.println("-----------------------------------");

		boolean replace = empMap.replace(30, "Author-C", "Author-D");
		System.out.println(replace);

		empMap.forEach((k, v) -> System.out.println(k + "\t" + v));

		System.out.println("-----------------------------------------------");

		String replace2 = empMap.replace(20, "Author-X");
		System.out.println(replace2);

		String replace3 = empMap.replace(200, "Author-X");
		System.out.println(replace3);

	}
}
