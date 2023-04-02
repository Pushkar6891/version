package com.array.eg007.selectionsort;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		if (arr.length <= 1) {
			return;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				int tmp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 5, 14, 2, 3, 1 };

		System.out.print("Input: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		SelectionSort.selectionSort(a);

		System.out.println();

		System.out.print("Output: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}