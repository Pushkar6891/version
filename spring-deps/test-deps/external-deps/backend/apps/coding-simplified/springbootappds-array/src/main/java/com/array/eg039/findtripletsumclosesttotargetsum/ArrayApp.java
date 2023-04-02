package com.array.eg039.findtripletsumclosesttotargetsum;

import java.util.Arrays;

public class ArrayApp {

	public static int tripletSumWithClosestToGivenSum(int[] arr, int sum) {
		Arrays.sort(arr);

		int minDifference = Integer.MAX_VALUE;
		int closestSum = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length - 2; i++) {

			int start = i + 1;
			int end = arr.length - 1;

			while (start < end) {
				int tripletSum = arr[i] + arr[start] + arr[end];

				if (Math.abs(sum - tripletSum) <= minDifference && tripletSum < closestSum) {
					minDifference = Math.abs(sum - tripletSum);
					closestSum = tripletSum;
				}

				if (tripletSum == sum) {
					return tripletSum;
				} else if (tripletSum < sum) {
					start++;
				} else {
					end--;
				}
			}
		}

		return closestSum;
	}

	public static void main(String[] args) {
		int arr1[] = { 2, -3, 4, -2 };
		int arr2[] = { 2, -3, 4, -2 };

		System.out.println(ArrayApp.tripletSumWithClosestToGivenSum(arr1, 1));
		System.out.println(ArrayApp.tripletSumWithClosestToGivenSum(arr2, 3));
	}

}