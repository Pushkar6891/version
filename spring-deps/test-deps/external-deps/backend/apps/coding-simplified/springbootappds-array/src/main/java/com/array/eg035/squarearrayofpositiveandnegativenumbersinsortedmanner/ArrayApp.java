package com.array.eg035.squarearrayofpositiveandnegativenumbersinsortedmanner;

public class ArrayApp {

	public static int[] squareInSortedManner(int[] arr) {

		int[] squareArr = new int[arr.length];
		int i = arr.length - 1;

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			if (arr[start] * arr[start] > arr[end] * arr[end]) {
				squareArr[i--] = arr[start] * arr[start];
				start++;
			} else {
				squareArr[i--] = arr[end] * arr[end];
				end--;
			}
		}

		return squareArr;
	}

	public static void squareInSortedMannerExistingArray(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			if (arr[start] * arr[start] > arr[end] * arr[end]) {
				int t = arr[start];
				arr[start] = arr[end];
				arr[end] = t;
			}

			arr[end] = arr[end] * arr[end];
			end--;
		}
	}

	public static void main(String[] args) {
		int arr[] = { -4, -2, -1, 3, 5 };

		int[] squareArr = ArrayApp.squareInSortedManner(arr);

		for (int i = 0; i < squareArr.length; i++) {
			System.out.print(squareArr[i] + " ");
		}
		System.out.println();

		ArrayApp.squareInSortedMannerExistingArray(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}