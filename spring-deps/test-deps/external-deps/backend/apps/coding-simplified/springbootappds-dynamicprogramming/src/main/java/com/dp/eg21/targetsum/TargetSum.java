package com.dp.eg21.targetsum;

public class TargetSum {

	public static int ifTargetSumExists(int[] arr, int sum) {
		if (arr.length == 0) {
			return 0;
		}

		int sumOfArrayElement = 0;

		for (int i = 0; i < arr.length; i++) {
			sumOfArrayElement = sumOfArrayElement + arr[i];
		}

		if (sumOfArrayElement < sum || (sumOfArrayElement + sum) % 2 != 0) {
			return 0;
		}

		int sumToCheck = (sumOfArrayElement + sum) / 2;

		return countSubsetsWithSumEqualToGivenSum(arr, sumToCheck);
	}

	private static int countSubsetsWithSumEqualToGivenSum(int[] arr, int sum) {
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

		int[] arr = { 1, 2, 1, 3 };
		int sum = 3;

		System.out.println(TargetSum.ifTargetSumExists(arr, sum));

	}

}