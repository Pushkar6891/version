package com.array.eg029.kadane.findsubarraywithmaxsum;

class ArrayImpl {

	public int findLargestSubarraySum(int[] arr) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return -1;
		}

		boolean ifPositiveExists = false;
		int max_element = Integer.MIN_VALUE;
		int max_sum = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				ifPositiveExists = true;
			}

			max_element = Math.max(arr[i], max_element);
			sum = sum + arr[i];

			if (sum < 0) {
				sum = 0;
				continue;
			}

			max_sum = Math.max(max_sum, sum);
		}

		return ifPositiveExists ? max_sum : max_element;
	}

}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { -3, 2, -7, 6, -2, 4, -8, 5 };

		System.out.println(a.findLargestSubarraySum(arr));
	}
}