package com.dp.eg03.minimumjumpstoreachnthstairusing123steps;

class MinStair {

	public int minSteps(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2 || n == 3)
			return 1;

		return 1 + Math.min(Math.min(minSteps(n - 1), minSteps(n - 2)), minSteps(n - 3));
	}

	public int minStepsTopDown(int[] arr, int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2 || n == 3)
			return 1;

		if (arr[n] == 0) {
			arr[n] = 1 + Math.min(Math.min(minStepsTopDown(arr, n - 1), minStepsTopDown(arr, n - 2)),
					minStepsTopDown(arr, n - 3));
		}

		return arr[n];
	}

	public int minStepsBottomUp(int n) {
		int[] f = new int[n + 1];

		f[0] = 0;
		f[1] = 1;
		f[2] = 1;

		for (int i = 3; i <= n; i++) {
			f[i] = 1 + Math.min(Math.min(f[i - 1], f[i - 2]), f[i - 3]);
		}

		return f[n];
	}

	public int minStepsBottomUpBetter(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		int d;

		for (int i = 3; i <= n; i++) {
			d = 1 + Math.min(Math.min(a, b), c);

			a = b;
			b = c;
			c = d;
		}

		return c;
	}
}

public class MinimumStepsToReachNthStair {

	public static void main(String[] args) {
		MinStair a = new MinStair();
		int n = 7;
		System.out.println(a.minSteps(n));

		int[] arr = new int[n + 1];
		System.out.println(a.minStepsTopDown(arr, n));

		System.out.println(a.minStepsBottomUp(n));

		System.out.println(a.minStepsBottomUpBetter(n));
	}
}