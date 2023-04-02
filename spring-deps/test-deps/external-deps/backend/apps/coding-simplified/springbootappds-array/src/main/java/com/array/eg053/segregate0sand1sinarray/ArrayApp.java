package com.array.eg053.segregate0sand1sinarray;

public class ArrayApp {

	public static void seperate0s1sNumbers(int[] arr) {
		if (arr.length <= 1) {
			return;
		}

		int left, right;
		left = 0;
		right = arr.length - 1;

		while (left < right) {
			while (arr[left] % 2 == 0 && left < right) {
				left++;
			}

			while (arr[right] % 2 == 1 && left < right) {
				right--;
			}

			if (left < right) {
				int x = arr[left];
				arr[left] = arr[right];
				arr[right] = x;

				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1 };

		ArrayApp.seperate0s1sNumbers(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}