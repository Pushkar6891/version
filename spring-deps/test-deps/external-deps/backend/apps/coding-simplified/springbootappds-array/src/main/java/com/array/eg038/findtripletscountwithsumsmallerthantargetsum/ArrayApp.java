package com.array.eg038.findtripletscountwithsumsmallerthantargetsum;

import java.util.Arrays;

public class ArrayApp {

	public static int tripletsWithLessThanGivenSum(int[] arr, int sum) {
		Arrays.sort(arr);

		int tripletCount = 0;

		for (int i = 0; i < arr.length - 2; i++) {

			int start = i + 1;
			int end = arr.length - 1;

			while (start < end) {
				int t = arr[i] + arr[start] + arr[end];

				if (t < sum) {
					tripletCount = tripletCount + end - start;
					start++;
				} else {
					end--;
				}
			}
		}

		return tripletCount;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, -3, 4, -2 };

		System.out.println(ArrayApp.tripletsWithLessThanGivenSum(arr, 1));
	}

}