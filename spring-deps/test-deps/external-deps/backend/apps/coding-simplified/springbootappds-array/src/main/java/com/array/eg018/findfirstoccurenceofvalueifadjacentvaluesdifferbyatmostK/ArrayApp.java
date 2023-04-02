package com.array.eg018.findfirstoccurenceofvalueifadjacentvaluesdifferbyatmostK;

class ArrayImpl {

	/*
	 * It'll return first occurrence of given value, if adjacent values differ by
	 * atMost k
	 */
	public int findWhereAdjacentDifferByAtMostk(int arr[], int k, int val) {
		int start = 0;

		while (start < arr.length) {
			if (arr[start] == val) {
				return start;
			}

			int diff = Math.abs(arr[start] - val) / k;
			diff = Math.max(1, diff);

			start = start + diff;
		}

		return -1;
	}

}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr1[] = { 70, 60, 70, 80, 90, 110, 130 };
		int arr2[] = { 2, 3, 2, 4, 5, 6, 7 };

		System.out.println(a.findWhereAdjacentDifferByAtMostk(arr1, 20, 110));
		System.out.println(a.findWhereAdjacentDifferByAtMostk(arr2, 1, 2));

	}
}