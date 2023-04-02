package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapComputeIfAbsentTest {

	public static void main(String[] args) {

		Map<Integer, String> techNameMap = new LinkedHashMap<>();
		techNameMap.put(1, "Java");
		techNameMap.put(2, null);
		System.out.println("Original map: " + techNameMap);

		techNameMap.computeIfAbsent(1, key -> "Java at " + key);
		System.out.println("No changes: " + techNameMap);

		techNameMap.computeIfAbsent(2, key -> ".Net at " + key);
		System.out.println("Null updated: " + techNameMap);

		techNameMap.computeIfAbsent(3, key -> "Python at " + key);
		System.out.println("New key: " + techNameMap);

		System.out.println("------------------------------------------");

		Map<String, Collection<String>> multiTechMap = new HashMap<>();
		multiTechMap.computeIfAbsent("names", key -> new ArrayList<>()).add("KK");
		System.out.println("multimap: " + multiTechMap);

		multiTechMap.computeIfAbsent("names", key -> new ArrayList<>()).add("PK");
		multiTechMap.computeIfAbsent("names", key -> new ArrayList<>()).add("RK");

		multiTechMap.computeIfAbsent("fruits", key -> new ArrayList<>()).add("Apple");
		multiTechMap.computeIfAbsent("fruits", key -> new ArrayList<>()).add("Mango");
		System.out.println("multimap: " + multiTechMap);
	}
}