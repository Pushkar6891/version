package com.array.eg043.cyclicsort.sortelementsfrom1ton;

public class ArrayApp {

	public static void cyclicSort(int[] arr) {
		if (arr.length <= 1) {
			return;
		}

		int i = 0;
		while (i < arr.length) {
			if (arr[i] - 1 != i) {
				int otherIndex = arr[i] - 1;

				int x = arr[i];
				arr[i] = arr[otherIndex];
				arr[otherIndex] = x;
			} else {
				i++;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 6, 2, 1, 5 };

		ArrayApp.cyclicSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}