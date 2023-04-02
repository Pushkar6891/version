package com.array.eg044.findmissingnumberbetweennumberrange;

public class ArrayApp {

	public static int findMissingNumber(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}

		int i = 0;
		while (i < arr.length) {
			if (arr[i] <= arr.length && arr[i] != i + 1) {
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
				return i + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 6, 1 };

		System.out.println(ArrayApp.findMissingNumber(arr));
	}

}