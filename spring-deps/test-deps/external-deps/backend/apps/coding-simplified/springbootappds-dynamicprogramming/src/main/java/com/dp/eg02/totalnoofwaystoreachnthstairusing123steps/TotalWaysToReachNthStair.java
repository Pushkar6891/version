package com.dp.eg02.totalnoofwaystoreachnthstairusing123steps;

class Stair {

	public int totalWaysToReachNthStair(int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		return totalWaysToReachNthStair(n - 1) + totalWaysToReachNthStair(n - 2) + totalWaysToReachNthStair(n - 3);
	}

	public int totalWaysToReachNthStairTopDown(int[] arr, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		if (arr[n] == 0) {
			arr[n] = totalWaysToReachNthStairTopDown(arr, n - 1) + totalWaysToReachNthStairTopDown(arr, n - 2)
					+ totalWaysToReachNthStairTopDown(arr, n - 3);
		}

		return arr[n];
	}

	public int totalWaysToReachNthStairBottomUp(int n) {
		int[] f = new int[n + 1];

		f[0] = 1;
		f[1] = 1;
		f[2] = 2;

		for (int i = 3; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2] + f[i - 3];
		}

		return f[n];
	}

	public int totalWaysToReachNthStairBottomUpBetter(int n) {
		int a = 1;
		int b = 1;
		int c = 2;
		int d;

		for (int i = 3; i <= n; i++) {
			d = a + b + c;

			a = b;
			b = c;
			c = d;
		}

		return c;
	}

}

public class TotalWaysToReachNthStair {

	public static void main(String[] args) {
		Stair a = new Stair();
		int n = 3;
		System.out.println(a.totalWaysToReachNthStair(n));

		int[] arr = new int[n + 1];
		System.out.println(a.totalWaysToReachNthStairTopDown(arr, n));

		System.out.println(a.totalWaysToReachNthStairBottomUp(n));

		System.out.println(a.totalWaysToReachNthStairBottomUpBetter(n));

	}

}