package com.array.eg051.findfirstKmissingpositivenumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayApp {

	public static List<Integer> firstKMissingPositiveNumbers(int[] arr, int k) {
		if (arr.length == 0 || k < 1) {
			return new ArrayList<>();
		}

		int i = 0;
		while (i < arr.length) {
			if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
				int otherIndex = arr[i] - 1;

				int x = arr[i];
				arr[i] = arr[otherIndex];
				arr[otherIndex] = x;
			} else {
				i++;
			}
		}

		List<Integer> missing = new ArrayList<Integer>();

		Set<Integer> otherNumber = new HashSet<Integer>();

		for (i = 0; i < arr.length & missing.size() < k; i++) {
			if (arr[i] != i + 1) {
				missing.add(i + 1);
				otherNumber.add(arr[i]);
			}
		}

		for (int j = i; missing.size() < k; j++) {

			if (!otherNumber.contains(j + 1)) {
				missing.add(j + 1);
			}
		}

		return missing;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 11, 1, -3, 2, 8, 4 };

		System.out.println(ArrayApp.firstKMissingPositiveNumbers(arr, 5));
	}

}