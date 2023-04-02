package com.dp.eg08.minimumnumberofoperationsforstringtransformation;

public class MinEditOperationsInStringTransform {

	public static int editOperations(String s1, String s2) {

		if (s1 == s2) {
			return 0;
		}

		return editOperationsImpl(s1, s2, s1.length(), s2.length());
	}

	public static int editOperationsImpl(String s1, String s2, int n, int m) {
		if (n == 0) {
			return m;
		}

		if (m == 0) {
			return n;
		}

		if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
			return editOperationsImpl(s1, s2, n - 1, m - 1);
		}

		return 1 + Math.min(Math.min(editOperationsImpl(s1, s2, n - 1, m - 1), editOperationsImpl(s1, s2, n, m - 1)),
				editOperationsImpl(s1, s2, n - 1, m));
	}

	public static int editOperationsBottomUp(String s1, String s2, int n, int m) {
		if (s1 == s2) {
			return 0;
		}

		if (n == 0) {
			return m;
		}

		if (m == 0) {
			return n;
		}

		int[][] arr = new int[n + 1][m + 1];

		for (int i = 0; i <= m; i++) {
			arr[0][i] = i;
		}

		for (int i = 0; i <= n; i++) {
			arr[i][0] = i;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {

				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1];
				} else {
					arr[i][j] = 1 + Math.min(arr[i - 1][j - 1], Math.min(arr[i][j - 1], arr[i - 1][j]));
				}
			}
		}

		return arr[n][m];
	}

	public static void main(String[] args) {
		String s1 = "bat";
		String s2 = "bau";

		System.out.println(MinEditOperationsInStringTransform.editOperations(s1, s2));

		System.out.println(editOperationsBottomUp(s1, s2, s1.length(), s2.length()));
	}

}