package com.dp.eg23.findmaxsumofarrayifconsecutiveelementsarenotallowed;

public class MaxSumArrayNonConsecutiveElements {

	public static int maxSum(int[] a) {
		if (a.length == 0) {
			return 0;
		}

		if (a.length == 1) {
			return a[0];
		}

		int[] dp = new int[a.length];

		dp[0] = a[0];
		dp[1] = a[0] > a[1] ? a[0] : a[1];

		for (int i = 2; i < a.length; i++) {
			dp[i] = Math.max(dp[i - 1], a[i] + dp[i - 2]);
		}

		return dp[a.length - 1];
	}

	public static void main(String[] args) {

		int[] arr = { 4, 2, 3, 5, 1, 6, 7 };

		System.out.println(MaxSumArrayNonConsecutiveElements.maxSum(arr));
	}

}