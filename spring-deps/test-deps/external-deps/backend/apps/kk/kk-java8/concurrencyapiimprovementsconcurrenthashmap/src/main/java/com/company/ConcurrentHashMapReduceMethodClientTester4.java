package com.company;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapReduceMethodClientTester4 {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("Krishna", "India");
		map.put("Ahmad", "Pakistan");
		map.put("Frank", "Us");
		map.put("Martin", "Germany");

		String reduce = map.reduce(2, (k, v) -> k + "-" + v, (r1, r2) -> r1 + "," + r2);
		System.out.println(reduce);

		System.out.println("----------------------------------------------");

		String reduceKeys = map.reduceKeys(2, (k1, k2) -> k1 + "," + k2);
		System.out.println(reduceKeys);
		System.out.println("----------------------------------------------");
		String reduceValues = map.reduceValues(2, (v1, v2) -> v1 + "," + v2);
		System.out.println(reduceValues);

	}
}