package com.array.eg047.findallmissingandduplicatevaluesin1tonnumberrange;

import java.util.ArrayList;
import java.util.List;

public class ArrayApp {

	public static List<List<Integer>> findAllMissingAndDuplicateValues(int[] arr) {
		if (arr.length == 0) {
			return new ArrayList<>();
		}

		int i = 0;
		while (i < arr.length) {
			if (arr[i] != arr[arr[i] - 1]) {
				int otherIndex = arr[i] - 1;

				int x = arr[i];
				arr[i] = arr[otherIndex];
				arr[otherIndex] = x;
			} else {
				i++;
			}
		}

		List<Integer> missingValues = new ArrayList<>();
		List<Integer> duplicateValues = new ArrayList<>();

		for (i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				missingValues.add(i + 1);
				duplicateValues.add(arr[i]);
			}
		}

		List<List<Integer>> result = new ArrayList<>();
		result.add(missingValues);
		result.add(duplicateValues);

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 6, 4, 4, 3, 2 };

		System.out.println(ArrayApp.findAllMissingAndDuplicateValues(arr));
	}

}