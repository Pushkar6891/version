package com.java8.eg0016;

import java.util.HashMap;
import java.util.Map;

public class ForEachLoopIterateMapTester {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();
		map.put(10614145, new Employee(1, "Sachin"));
		map.put(10614149, new Employee(3, "Rahul"));
		map.put(10614140, new Employee(2, "Virat"));

		// 1. Before Using EntrySet
		// 2. Using Iterator
		// 3. Using keySet and valueSet

		// 4. Using foreach
		map.forEach((k, v) -> System.out.println("Key: " + k + " " + "Value : " + v));

	}
}
