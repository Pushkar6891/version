package com.array.eg006.insertionsort;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		if (arr.length <= 1) {
			return;
		}

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j;

			for (j = i - 1; j >= 0 && arr[j] > key; j--) {
				arr[j + 1] = arr[j];
			}

			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int a[] = { 5, 14, 2, 3, 1 };

		System.out.print("Input: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		InsertionSort.insertionSort(a);

		System.out.println();

		System.out.print("Output: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}