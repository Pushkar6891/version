package com.dp.eg13.checkifequalsumpartitionexistsforgivenarray;

public class SubsetSumEqualPartition {

	public static boolean ifSubsetExistsWithEqualPartition(int[] arr) {
		if (arr.length == 0) {
			return false;
		}

		int sumOfArray = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOfArray = sumOfArray + arr[i];
		}

		if (sumOfArray % 2 != 0) {
			return false;
		}

		int sum = sumOfArray / 2;

		boolean[][] mat = new boolean[arr.length][sum + 1];

		for (int i = 0; i < arr.length; i++) {
			mat[i][0] = true;
		}

		for (int j = 0; j <= sum; j++) {
			if (j == arr[0]) {
				mat[0][j] = true;
			}
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j <= sum; j++) {

				if (mat[i - 1][j]) {
					mat[i][j] = true;
				} else {
					if (j >= arr[i]) {
						mat[i][j] = mat[i - 1][j - arr[i]];
					}
				}
			}
		}

		return mat[arr.length - 1][sum];
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 7 };

		System.out.println(SubsetSumEqualPartition.ifSubsetExistsWithEqualPartition(arr));

	}

}