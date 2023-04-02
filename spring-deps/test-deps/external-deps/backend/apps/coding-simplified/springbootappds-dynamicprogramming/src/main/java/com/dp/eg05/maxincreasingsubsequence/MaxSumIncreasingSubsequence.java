package com.dp.eg05.maxincreasingsubsequence;

public class MaxSumIncreasingSubsequence {

	public static int maxSumOfIncreasingSubsequence(int[] a) {
		int[] mis = new int[a.length];

		for (int i = 0; i < mis.length; i++) {
			mis[i] = a[i];
		}

		int maxIncreasingSequenceSum = a[0];

		for (int i = 1; i < mis.length; i++) {
			for (int j = 0; j < i; j++) {

				if (a[i] > a[j] && a[i] + mis[j] > mis[i]) {
					mis[i] = a[i] + mis[j];

					maxIncreasingSequenceSum = Math.max(maxIncreasingSequenceSum, mis[i]);
				}
			}
		}

		return maxIncreasingSequenceSum;
	}

	public static void main(String[] args) {

		int a[] = { 7, 1, 4, 8, 11, 2, 14, 3 };

		System.out.println(MaxSumIncreasingSubsequence.maxSumOfIncreasingSubsequence(a));

	}

}