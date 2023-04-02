package com.array.eg015.searchvalueinsortedandunsortedarray;

class ArrayImpl {

	/*
	 * It'll search value in Unsorted array
	 */
	public int searchValueInUnsortedArray(int[] arr, int val) {
		if (arr.length == 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}

		return -1;
	}

	/*
	 * It'll search value in sorted array
	 */
	public int binarySearchSortedArray(int[] arr, int start, int end, int val) {

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == val) {
				return mid;
			} else if (val > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;
	}

}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { 14, 15, 8, 9, 5, 2 };

		System.out.println("Found value at Index: " + a.searchValueInUnsortedArray(arr, 9));
		System.out.println("Found value at Index: " + a.searchValueInUnsortedArray(arr, 100));

		int[] arr1 = { 2, 7, 9, 15, 50 };
		System.out.println("Found value at Index: " + a.binarySearchSortedArray(arr1, 0, arr1.length - 1, 7));
		System.out.println("Found value at Index: " + a.binarySearchSortedArray(arr1, 0, arr1.length - 1, 50));
		System.out.println("Found value at Index: " + a.binarySearchSortedArray(arr1, 0, arr1.length - 1, 100));

	}
}