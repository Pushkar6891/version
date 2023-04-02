package com.array.eg001.insertanelementinarray;

public class InsertElementInArray {

	int count = 0;

	public static void main(String[] args) {

		InsertElementInArray o = new InsertElementInArray();

		int a[] = new int[5];

		for (int j = 0; j < a.length; j++) {
			o.insert(a, j + 1);
		}

		o.print(a);

		o.insertAtStart(a, 34);
		o.print(a);

		o.insertAtStart(a, 56);
		o.print(a);

		o.insertAtPosition(a, 3, 90);
		o.print(a);
	}

	/*
	 * Insert the element at the end of array
	 */
	public void insert(int a[], int val) {
		a[count++] = val;
	}

	/*
	 * Insert the element at the start of array
	 */
	public void insertAtStart(int a[], int val) {

		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}

		a[0] = val;
	}

	/*
	 * Insert the element at the given position in array
	 */
	public void insertAtPosition(int a[], int position, int val) {

		for (int i = a.length - 1; i > position; i--) {
			a[i] = a[i - 1];
		}

		a[position] = val;
	}

	/*
	 * Print the array element
	 */
	public void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
	}

}
