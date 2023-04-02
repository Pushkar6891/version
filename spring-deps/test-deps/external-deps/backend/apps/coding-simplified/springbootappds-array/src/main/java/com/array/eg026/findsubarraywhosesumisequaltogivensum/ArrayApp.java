package com.array.eg026.findsubarraywhosesumisequaltogivensum;

import java.util.HashMap;
import java.util.Map;

class ArrayImpl {

	public void findSubArrayPositiveNumbers(int[] arr, int sum) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}

		int start, end, window_Sum;
		start = end = 0;
		window_Sum = 0;

		while (end < arr.length) {
			window_Sum = window_Sum + arr[end];

			if (window_Sum == sum) {
				System.out.println("Start Index: " + start + ", End Index: " + end);
				return;
			}

			while (window_Sum > sum && start <= end) {
				window_Sum = window_Sum - arr[start++];

				if (window_Sum == sum) {
					System.out.println("Start Index: " + start + ", End Index: " + end);
					return;
				}
			}

			end++;
		}

		System.out.println("There is no such sub-array");
	}

	public void findSubArray(int[] arr, int sum) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}

		int end, totalSumTillNow;
		end = 0;
		totalSumTillNow = 0;

		Map<Integer, Integer> map = new HashMap<>();

		while (end < arr.length) {
			totalSumTillNow = totalSumTillNow + arr[end];

			if (totalSumTillNow == sum) {
				System.out.println("Start Index: " + 0 + ", End Index: " + end);
				return;
			}

			int windowSum = totalSumTillNow - sum;

			if (map.containsKey(windowSum)) {
				int start = map.get(windowSum);
				System.out.println("Start Index: " + (start + 1) + ", End Index: " + end);
				return;
			}

			map.put(totalSumTillNow, end++);
		}
	}
}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { 4, 2, 5, 3, 1, 8 };

		a.findSubArray(arr, 9);
	}
}