package com.dp.eg01.fibonacci;

class DPFunctions {

	public int getFibonacciNumber(int n) {
		if (n < 2) {
			return n;
		}

		return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
	}

	public int getFibonacciNumberTopDown(int[] arr, int n) {
		if (n < 2) {
			return n;
		}

		if (arr[n] == 0) {
			arr[n] = getFibonacciNumberTopDown(arr, n - 1) + getFibonacciNumberTopDown(arr, n - 2);
		}

		return arr[n];
	}

	public int getFibonacciNumberBottomUp(int n) {
		int[] f = new int[n + 1];

		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}

	public int getFibonacciNumberBottomUpBetter(int n) {
		int a = 0;
		int b = 1;
		int c;

		for (int i = 2; i <= n; i++) {
			c = a + b;

			a = b;
			b = c;
		}

		return b;
	}

}

public class DPAPP {

	public static void main(String[] args) {

		DPFunctions a = new DPFunctions();
		int n = 10;
		System.out.println(a.getFibonacciNumber(n));

		int[] arr = new int[n + 1];
		System.out.println(a.getFibonacciNumberTopDown(arr, n));

		System.out.println(a.getFibonacciNumberBottomUp(n));

		System.out.println(a.getFibonacciNumberBottomUpBetter(n));

		System.out.println("First n terms : ");
		for (int i = 1; i <= n; i++) {
			System.out.print(a.getFibonacciNumber(i) + " ");
		}

		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.print(a.getFibonacciNumberBottomUp(i) + " ");
		}

		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.print(a.getFibonacciNumberBottomUpBetter(i) + " ");
		}
	}

}