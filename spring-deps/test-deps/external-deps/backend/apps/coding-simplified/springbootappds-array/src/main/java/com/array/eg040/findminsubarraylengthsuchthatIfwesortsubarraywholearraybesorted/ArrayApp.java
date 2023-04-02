package com.array.eg040.findminsubarraylengthsuchthatIfwesortsubarraywholearraybesorted;

public class ArrayApp {

	public static int getMinSubarrayLengthForSorting(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}

		int start = 0;
		while (start < arr.length - 1 && arr[start] < arr[start + 1]) {
			start++;
		}

		if (start == arr.length - 1) {
			return 0;
		}

		int end = arr.length - 1;
		while (end > 0 && arr[end - 1] < arr[end]) {
			end--;
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = start + 1; i < end; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}

		while (start >= 0 && arr[start] > min) {
			start--;
		}

		while (end < arr.length && arr[end] < max) {
			end++;
		}

		return end - start - 1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 3, 0, 22, 13, 8, 15, 18 };

		System.out.println(ArrayApp.getMinSubarrayLengthForSorting(arr));
	}

}