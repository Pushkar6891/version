package com.array.eg013.findequilibriumpointwhereelementsbeforeandafterithasequalsum;

class ArrayImpl {

	/*
	 * It'll return equilibrium Point in array where sum of elements before & after
	 * it is same
	 */
	public int getEquilibriumPoint(int[] a) {
		if (a.length == 0) {
			return -1;
		}

		int sum = 0;
		int sum_so_far = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		for (int i = 0; i < a.length; i++) {
			sum = sum - a[i];
			if (sum == sum_so_far) {
				return i;
			}
			sum_so_far = sum_so_far + a[i];
		}

		return -1;
	}

}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr1[] = { 0, 1, 1, 0, 2, 2, 1, 0, 2 };
		int arr2[] = { 1, 6, 7, 1, 2, 3, 4, 5 };
		int arr3[] = { 1, 6, 7, 0, 7 };

		System.out.println(a.getEquilibriumPoint(arr1));
		System.out.println(a.getEquilibriumPoint(arr2));
		System.out.println(a.getEquilibriumPoint(arr3));

	}

}