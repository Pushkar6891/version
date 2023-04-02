package com.dp.eg20.countnoofsubsetswithgivensum;

public class CountOfSubsetSum {

	public static int countSubsetsWithSumEqualToGivenSum(int[] arr, int sum) {
		if (arr.length == 0 || sum <= 0) {
			return 0;
		}

		int n = arr.length;

		int[][] count = new int[n][sum + 1];

		for (int i = 0; i < n; i++) {
			count[i][0] = 1;
		}

		for (int j = 0; j <= sum; j++) {
			if (arr[0] == j) {
				count[0][j] = 1;
			}
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= sum; j++) {

				int includingCurrentValue = 0;
				int excludingCurrentValue = 0;

				if (arr[i] <= j) {
					includingCurrentValue = count[i - 1][j - arr[i]];
				}

				excludingCurrentValue = count[i - 1][j];

				count[i][j] = includingCurrentValue + excludingCurrentValue;
			}
		}

		return count[n - 1][sum];
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 7, 1, 4, 5 };

		int sum = 7;

		System.out.println(CountOfSubsetSum.countSubsetsWithSumEqualToGivenSum(arr, sum));

	}

}