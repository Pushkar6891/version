package com.array.eg028.findsmallestsubarraylengthwithgivensum;

import java.util.HashMap;
import java.util.Map;

class ArrayImpl {

	public int findSmallestSubArrayofForGivenSumPositiveNumbers(int[] arr, int sum) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return -1;
		}

		int start, end, window_Sum, smallestLength;
		start = end = 0;
		window_Sum = 0;
		smallestLength = Integer.MAX_VALUE;

		while (end < arr.length) {
			window_Sum = window_Sum + arr[end];

			if (window_Sum == sum) {
				System.out.println("Start Index: " + start + ", End Index: " + end);
				smallestLength = Math.min(smallestLength, end - start + 1);
			}

			while (window_Sum > sum && start <= end) {
				window_Sum = window_Sum - arr[start++];

				if (window_Sum == sum) {
					System.out.println("Start Index: " + start + ", End Index: " + end);
					smallestLength = Math.min(smallestLength, end - start + 1);
				}
			}

			end++;
		}

		return smallestLength != Integer.MAX_VALUE ? smallestLength : -1;
	}

	public int findSmallestSubArrayofForGivenSum(int[] arr, int sum) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return -1;
		}

		int end, totalSumTillNow, smallestLength;
		end = 0;
		totalSumTillNow = 0;
		smallestLength = Integer.MAX_VALUE;

		Map<Integer, Integer> map = new HashMap<>();

		while (end < arr.length) {
			totalSumTillNow = totalSumTillNow + arr[end];

			if (totalSumTillNow == sum) {
				System.out.println("Start Index: " + 0 + ", End Index: " + end);
				smallestLength = Math.min(smallestLength, end + 1);
			}

			int windowSum = totalSumTillNow - sum;

			if (map.containsKey(windowSum)) {
				int start = map.get(windowSum);
				System.out.println("Start Index: " + (start + 1) + ", End Index: " + end);
				smallestLength = Math.min(smallestLength, end - start);
			}

			map.put(totalSumTillNow, end++);
		}

		return smallestLength != Integer.MAX_VALUE ? smallestLength : -1;
	}
}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { 3, 2, 5, 5, 3, 2, 10 };
		int sum = 10;

		System.out.println(a.findSmallestSubArrayofForGivenSumPositiveNumbers(arr, sum));
		System.out.println(a.findSmallestSubArrayofForGivenSum(arr, sum));
	}
}