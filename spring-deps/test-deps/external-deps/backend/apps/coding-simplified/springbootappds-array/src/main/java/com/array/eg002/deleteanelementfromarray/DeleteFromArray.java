package com.array.eg002.deleteanelementfromarray;

public class DeleteFromArray {
	static int count = 5;

	public static void main(String[] args) {

		int a[] = { 12, 34, 45, 6, 13 };
		DeleteFromArray obj = new DeleteFromArray();
		obj.print(a);

		obj.deleteFromEnd(a);

		obj.print(a);

		obj.deleteValue(a, 34);
		obj.print(a);

		obj.deleteFromPosition(a, 3);
		obj.print(a);

	}

	/*
	 * It'll delete last value from array
	 */
	public void deleteFromEnd(int[] a) {
		if (a.length == 0) {
			return;
		}

		count--;
	}

	/*
	 * It'll delete given value from array
	 */
	public void deleteValue(int a[], int val) {
		int i;
		for (i = 0; i < count; i++) {
			if (a[i] == val) {
				break;
			}
		}

		if (i == count) {
			System.out.println("Value doesn't exists in array");
			return;
		}

		for (int j = i; j < count - 1; j++) {
			a[j] = a[j + 1];
		}

		count--;
	}

	/*
	 * It'll delete given value from given position in array
	 */
	public void deleteFromPosition(int a[], int position) {
		if (position > count || position <= 0) {
			System.out.println("Invalid Position");
			return;
		}

		for (int i = position - 1; i < count - 1; i++) {
			a[i] = a[i + 1];
		}

		count--;
	}

	public void print(int[] a) {
		for (int i = 0; i < count; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
	}

}