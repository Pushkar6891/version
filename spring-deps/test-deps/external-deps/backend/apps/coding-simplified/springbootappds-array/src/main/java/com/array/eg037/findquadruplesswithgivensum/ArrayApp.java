package com.array.eg037.findquadruplesswithgivensum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayApp {

	public static List<List<Integer>> findQuadruple(int[] arr, int targetSum) {
		Arrays.sort(arr);

		List<List<Integer>> allQuadruple = new ArrayList<>();

		for (int i = 0; i < arr.length - 3; i++) {
			for (int j = i + 1; j < arr.length - 2; j++) {

				int sum = targetSum - (arr[i] + arr[j]);

				int start = j + 1;
				int end = arr.length - 1;

				while (start < end) {
					int t = arr[start] + arr[end];
					if (t == sum) {
						allQuadruple.add(Arrays.asList(arr[start], arr[end], arr[i], arr[j]));
						start++;
						end--;
					} else if (t < sum) {
						start++;
					} else {
						end--;
					}
				}
			}
		}

		return allQuadruple;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, -3, 4, -2, -1, 3 };

		System.out.println(ArrayApp.findQuadruple(arr, 3));
	}

}