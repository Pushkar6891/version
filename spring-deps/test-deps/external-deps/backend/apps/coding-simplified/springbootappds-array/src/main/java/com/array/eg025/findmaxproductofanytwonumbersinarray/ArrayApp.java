package com.array.eg025.findmaxproductofanytwonumbersinarray;

class ArrayImpl {

	public int getMaxMultiplicationOfTwoNumbers(int[] arr) {
		if (arr.length < 2) {
			return -1;
		}

		if (arr.length == 2) {
			return arr[0] * arr[1];
		}

		int smallest = arr[0] < arr[1] ? arr[0] : arr[1];
		int secondSmallest = arr[0] > arr[1] ? arr[0] : arr[1];

		int greatest = arr[0] > arr[1] ? arr[0] : arr[1];
		int secondGreatest = arr[0] < arr[1] ? arr[0] : arr[1];

		for (int i = 2; i < arr.length; i++) {

			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}

			if (arr[i] > greatest) {
				secondGreatest = greatest;
				greatest = arr[i];
			} else if (arr[i] > secondGreatest) {
				secondGreatest = arr[i];
			}
		}

		int firstTwoMultiplication = smallest * secondSmallest;
		int lastTwoMultiplication = greatest * secondGreatest;

		return firstTwoMultiplication > lastTwoMultiplication ? firstTwoMultiplication : lastTwoMultiplication;
	}
}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { -4, 2, 3, -10, 4, -15, 3, 6 };

		System.out.println(a.getMaxMultiplicationOfTwoNumbers(arr));
	}
}