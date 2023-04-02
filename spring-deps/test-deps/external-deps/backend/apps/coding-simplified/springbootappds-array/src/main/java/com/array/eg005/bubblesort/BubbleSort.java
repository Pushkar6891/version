package com.array.eg005.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 12, 5, 3, -1 };

		BubbleSort obj = new BubbleSort();
		obj.print(a);
		obj.bubbleSort(a);
		obj.print(a);
	}

	/*
	 * It'll sort the array using Bubble Sort technique
	 */
	public void bubbleSort(int a[]) {
		if (a.length <= 1) {
			return;
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}

	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
	}

}