package com.dp.eg25.countallpalindromesubstringingivenstring;

public class CountOfPalindromeSubString {

	public static int countPalindromeSubString(String str, int n) {
		if (str == null || str.length() == 0) {
			return 0;
		}

		boolean[][] arr = new boolean[n][n];
		int count = str.length();

		for (int i = 0; i < str.length(); i++) {
			arr[i][i] = true;
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int j = i + 1; j < n; j++) {

				if (str.charAt(i) == str.charAt(j)) {
					if (arr[i + 1][j - 1] || j - i == 1) {
						arr[i][j] = true;
						count++;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String str = "bcacbf";

		System.out.println(countPalindromeSubString(str, str.length()));
	}

}