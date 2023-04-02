package com.array.eg024.checkifmultiplicationoftwonumbermatchestoavalueinarray;

import java.util.HashSet;

class ArrayImpl {

	public boolean checkIfProductOfPairMatchesValue(int[] arr, int val) {
		HashSet<Integer> s = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {

			if (val % arr[i] == 0 && s.contains(val / arr[i])) {
				return true;
			}

			s.add(arr[i]);
		}

		return false;
	}
}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr1[] = { 4, 2, 3, 10, 4, 15, 3, 6 };
		int arr2[] = { 3, 2, 15, -5, -1, 5 };

		System.out.println(a.checkIfProductOfPairMatchesValue(arr1, 15));
		System.out.println(a.checkIfProductOfPairMatchesValue(arr2, 15));
	}
}