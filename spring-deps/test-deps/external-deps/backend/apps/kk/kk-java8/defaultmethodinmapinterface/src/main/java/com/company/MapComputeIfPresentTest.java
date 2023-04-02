package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapComputeIfPresentTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Java");
		map.put(2, "Java");

		System.out.println("Original map: " + map);

		// recompute the values:
		map.computeIfPresent(1, (key, oldVal) -> oldVal.concat("Script"));
		map.computeIfPresent(2, (key, oldVal) -> oldVal.concat("FrameWork"));
		System.out.println("Recomputed map: " + map);

		// return "null" to remove value:
		String r1 = map.computeIfPresent(1, (key, oldVal) -> null);
		System.out.println(r1);
		// null for does nothing:
		String r2 = map.computeIfPresent(3, (key, oldVal) -> null);
		System.out.println(r2);
		String r3 = map.computeIfPresent(30, (key, oldVal) -> "Spring Framework");
		System.out.println(r3);
		System.out.println("After null: " + map);
	}
}