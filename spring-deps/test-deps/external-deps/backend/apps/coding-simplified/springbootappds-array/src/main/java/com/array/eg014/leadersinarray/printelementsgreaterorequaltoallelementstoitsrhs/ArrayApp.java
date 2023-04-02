package com.array.eg014.leadersinarray.printelementsgreaterorequaltoallelementstoitsrhs;

class ArrayImpl {

	/*
	 * It'll print all elements where all elements on right side are lesser than the
	 * current value
	 */
	public void printElementsGreaterEqualToRightside(int a[]) {
		int max = Integer.MIN_VALUE;

		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] > max) {
				max = a[i];
				System.out.print(a[i] + " ");
			}
		}
	}

}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { 14, 15, 8, 9, 5, 2 };

		a.printElementsGreaterEqualToRightside(arr);
	}
}