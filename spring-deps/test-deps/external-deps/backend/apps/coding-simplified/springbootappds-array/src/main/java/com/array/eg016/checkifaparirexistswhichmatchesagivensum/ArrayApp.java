package com.array.eg016.checkifaparirexistswhichmatchesagivensum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ArrayImpl {

	/*
	 * It'll check if there exists a pair for given sum : Brute Force
	 */
	public boolean ifPairExistsWithGivenSumBruteForce(int[] arr, int sum) {
		if (arr.length == 0) {
			return false;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					return true;
				}
			}
		}

		return false;
	}

	/*
	 * It'll check if there exists a pair for given sum : Using Sorting
	 */
	public boolean ifPairExistsWithGivenSumSorting(int[] arr, int sum) {
		if (arr.length == 0) {
			return false;
		}

		Arrays.sort(arr);

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int s = arr[start] + arr[end];

			if (s == sum) {
				return true;
			} else if (s > sum) {
				end--;
			} else {
				start++;
			}
		}

		return false;
	}

	/*
	 * It'll check if there exists a pair for given sum : Using Hashing
	 */
	public boolean ifPairExistsWithGivenSumHashing(int[] arr, int sum) {
		if (arr.length == 0) {
			return false;
		}

		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (s.contains(sum - arr[i])) {
				return true;
			} else {
				s.add(arr[i]);
			}
		}

		return false;
	}

}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { 12, 3, 5, 1, 9 };

		System.out.println(a.ifPairExistsWithGivenSumBruteForce(arr, 10));
		System.out.println(a.ifPairExistsWithGivenSumSorting(arr, 10));
		System.out.println(a.ifPairExistsWithGivenSumHashing(arr, 10));
	}
}