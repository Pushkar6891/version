package com.dp.eg10.longestpalindromesubstringlength;

public class LongestPalindromeSubtringLength {

	public static int lpSubstring(String str, int start, int end) {
		if (start > end) {
			return 0;
		}

		if (start == end) {
			return 1;
		}

		if (str.charAt(start) == str.charAt(end)) {
			int lpsRemainingString = end - start - 1;

			if (lpsRemainingString == lpSubstring(str, start + 1, end - 1)) {
				return 2 + lpsRemainingString;
			}
		}

		return Math.max(lpSubstring(str, start + 1, end), lpSubstring(str, start, end - 1));
	}

	public static int lpSubStringTopDown(String str, int start, int end, Integer[][] arr) {
		if (start > end) {
			return 0;
		}

		if (start == end) {
			return 1;
		}

		if (arr[start][end] == null) {
			if (str.charAt(start) == str.charAt(end)) {
				int lpsRemainingString = end - start - 1;

				if (lpsRemainingString == lpSubStringTopDown(str, start + 1, end - 1, arr)) {
					arr[start][end] = 2 + lpsRemainingString;
					return arr[start][end];
				}

			}

			arr[start][end] = Math.max(lpSubStringTopDown(str, start, end - 1, arr),
					lpSubStringTopDown(str, start + 1, end, arr));
		}

		return arr[start][end];
	}

	public static int lpSubstringBottomUp(String str, int n) {
		if (str == "") {
			return 0;
		}

		boolean[][] arr = new boolean[n][n];
		int maxLps = 1;

		for (int i = 0; i < str.length(); i++) {
			arr[i][i] = true;
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int j = i + 1; j < n; j++) {

				if (str.charAt(i) == str.charAt(j)) {
					if (arr[i + 1][j - 1] || j - i == 1) {
						arr[i][j] = true;
						maxLps = Math.max(maxLps, j - i + 1);
					}
				}
			}
		}

		return maxLps;
	}

	public static void main(String[] args) {
		String str = "bdb";

		System.out.println(LongestPalindromeSubtringLength.lpSubstring(str, 0, str.length() - 1));

		Integer[][] arr = new Integer[str.length()][str.length()];
		System.out.println(LongestPalindromeSubtringLength.lpSubStringTopDown(str, 0, str.length() - 1, arr));

		System.out.println(lpSubstringBottomUp(str, str.length()));
	}

}