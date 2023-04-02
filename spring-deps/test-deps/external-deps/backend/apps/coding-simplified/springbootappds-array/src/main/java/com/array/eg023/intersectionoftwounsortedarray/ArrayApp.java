package com.array.eg023.intersectionoftwounsortedarray;

import java.util.HashSet;
import java.util.Set;

class ArrayImpl {
	/*
	 * It'll return intersection of two unsorted array
	 */
	public void intersectionOfTwoUnSortedArray(int[] arr1, int[] arr2, Set<Integer> finalIntersection) {
		int i = 0;
		int j = 0;
		Set<Integer> tempSet = new HashSet<>();

		while (i < arr1.length) {
			tempSet.add(arr1[i++]);
		}

		while (j < arr2.length) {
			if (tempSet.contains(arr2[j])) {
				finalIntersection.add(arr2[j]);
			}

			j++;
		}
	}
}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr1[] = { 4, 2, 3, 5, 4, 2, 3 };
		int arr2[] = { 9, 1, 7, 2, 4, 2, 1, 2 };
		Set<Integer> finalIntersection = new HashSet<>();

		a.intersectionOfTwoUnSortedArray(arr1, arr2, finalIntersection);
		System.out.println(finalIntersection);
	}
}