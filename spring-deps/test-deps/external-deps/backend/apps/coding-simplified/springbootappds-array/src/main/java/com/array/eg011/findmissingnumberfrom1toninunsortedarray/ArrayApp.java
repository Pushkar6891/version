package com.array.eg011.findmissingnumberfrom1toninunsortedarray;

class ArrayImpl {

	/*
	 * It'll return missing element in given array range of 1 to n
	 */
	public int findMissingUnsortedArray(int[] arr, int n) {
		int sum = (n * (n + 1)) / 2;

		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}

		return sum;
	}
}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { 2, 4, 1, 3, 6, 7, 8 };

		System.out.println(a.findMissingUnsortedArray(arr, arr.length + 1));
	}

}