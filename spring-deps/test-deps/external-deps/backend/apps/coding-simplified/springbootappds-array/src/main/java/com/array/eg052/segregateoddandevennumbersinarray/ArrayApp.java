package com.array.eg052.segregateoddandevennumbersinarray;

public class ArrayApp {

	public static void seperateEvenOddNumbers(int[] arr) {
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

			while (arr[right] % 2 != 0 && left < right) {
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
		int[] arr = { 1, 2, 4, 3, 5, 7, 8, 6 };

		ArrayApp.seperateEvenOddNumbers(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}