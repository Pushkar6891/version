package com.array.eg008.mergesort;

public class MergeSort {

	public static void mergeSort(int[] arr, int start, int end) {
		if (start != end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int i = start;
		int j = mid + 1;
		int k = 0;

		int[] temp = new int[end - start + 1];

		while ((i <= mid) && (j <= end)) {
			if (arr[i] < arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}

		while (i <= mid) {
			temp[k++] = arr[i++];
		}

		while (j <= end) {
			temp[k++] = arr[j++];
		}

		for (i = start; i <= end; i++) {
			arr[i] = temp[i - start];
		}
	}

	public static void main(String[] args) {
		int a[] = { 5, 14, 2, 3, 1 };

		System.out.print("Input: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		MergeSort.mergeSort(a, 0, a.length - 1);

		System.out.println();

		System.out.print("Output: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}