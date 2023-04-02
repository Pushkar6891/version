package com.array.eg032.sortarraybasedonfrequencyofvaluethenascorder;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayApp {

	public static List<Integer> sortBasedOnFrequencyAndValue(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
		}

		Collections.sort(list, (n1, n2) -> {
			int freq1 = map.get(n1);
			int freq2 = map.get(n2);

			if (freq1 != freq2) {
				return freq2 - freq1;
			}

			return n1 - n2;
		});

		return list;
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 10, 7, 10, 11, 10, 7, 6, 5 };
		List<Integer> list1 = Arrays.asList(arr1);
		System.out.println(ArrayApp.sortBasedOnFrequencyAndValue(list1));

		Integer[] arr2 = { 9, 8, 8, 6, -3, 9, 6, -4, 6, 5 };
		List<Integer> list2 = Arrays.asList(arr2);
		System.out.println(ArrayApp.sortBasedOnFrequencyAndValue(list2));
	}

}