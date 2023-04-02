package com.array.eg045.findcorruptpairinnumberrange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayApp {

	public static List<Integer> findCurruptPair(int[] arr) {
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

		for (i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				return new ArrayList<>(Arrays.asList(i + 1, arr[i]));
			}
		}

		return new ArrayList<>();
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 4, 5, 1 };

		System.out.println(ArrayApp.findCurruptPair(arr));
	}

}