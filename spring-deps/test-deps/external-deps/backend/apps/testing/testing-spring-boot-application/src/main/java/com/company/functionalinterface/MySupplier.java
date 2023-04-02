package com.company.functionalinterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class MySupplier {

	private Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc:mysql://localhost:3306/springbootdb";
	private Supplier<List<String>> getFruitsSupplier = () -> new LinkedList<>(
			Arrays.asList("Apple", "Mango", "Kiwi", "Orange", "Banana"));
	private Supplier<Set<Integer>> getNumberSupplier = () -> new HashSet<>(Arrays.asList(9, 8, 2, 6, 3, 9, 6, 4, 6, 5));
	private Supplier<Map<String, Integer>> getMarksSupplier = () -> new HashMap<String, Integer>() {

		private static final long serialVersionUID = 1L;

		{
			put("Pushkar", 90);
			put("Amit", 80);
			put("Pooja", 99);
		}
	};

	public String getDBConnectionUrlSupplier() {
		return getDBConnectionUrlSupplier.get();
	}

	public List<String> getFruitsSupplier() {
		return getFruitsSupplier.get();
	}

	public Set<Integer> getNumberSupplier() {
		return getNumberSupplier.get();
	}

	public Map<String, Integer> getMarksSupplier() {
		return getMarksSupplier.get();
	}
}
