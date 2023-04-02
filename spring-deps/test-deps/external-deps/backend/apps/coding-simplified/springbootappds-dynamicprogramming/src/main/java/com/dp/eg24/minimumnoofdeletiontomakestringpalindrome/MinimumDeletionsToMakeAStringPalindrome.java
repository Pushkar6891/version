package com.dp.eg24.minimumnoofdeletiontomakestringpalindrome;

public class MinimumDeletionsToMakeAStringPalindrome {

	public static int minDeletionsToMakeStringPalindrome(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}

		return str.length() - lpsBottomUp(str, str.length());
	}

	public static int lpsBottomUp(String str, int n) {
		int[][] arr = new int[n][n];

		for (int i = 0; i < str.length(); i++) {
			arr[i][i] = 1;
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int j = i + 1; j < n; j++) {

				if (str.charAt(i) == str.charAt(j)) {
					arr[i][j] = 2 + arr[i + 1][j - 1];
				} else {
					arr[i][j] = Math.max(arr[i + 1][j], arr[i][j - 1]);
				}
			}
		}

		return arr[0][n - 1];
	}

	public static void main(String[] args) {
		String str = "abefbac";

		System.out.println(minDeletionsToMakeStringPalindrome(str));
	}

}

// ef