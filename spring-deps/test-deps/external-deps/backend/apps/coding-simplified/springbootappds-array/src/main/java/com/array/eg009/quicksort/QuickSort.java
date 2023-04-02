package com.array.eg009.quicksort;

public class QuickSort {

	public static void quicksort(int[] arr, int start, int end) {
		int pivot, i, j, temp;

		if (start < end) {
			pivot = start;
			i = start;
			j = end;

			while (i < j) {
				while (arr[i] <= arr[pivot] && i < end)
					i++;
				while (arr[j] > arr[pivot] && j >= 0)
					j--;

				if (i < j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;

			quicksort(arr, start, j - 1);
			quicksort(arr, j + 1, end);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 8, 30, 6, 15, 2, 1, 18 };

		System.out.print("Input: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		QuickSort.quicksort(arr, 0, arr.length - 1);

		System.out.println();

		System.out.print("Output: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}