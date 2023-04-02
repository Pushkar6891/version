package com.array.eg046.findduplicatesin1tonrange;

public class ArrayApp {

	public static int findDuplicateValue(int[] arr) {
		if (arr.length <= 1) {
			return -1;
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

		return arr[arr.length - 1];
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 2, 1 };

		System.out.println(ArrayApp.findDuplicateValue(arr1));

		int[] arr2 = { 9, 8, 2, 6, 3, 9, 6, 4, 6, 5, 1, 7 };

		System.out.println(ArrayApp.findDuplicateValue(arr2));
	}

}