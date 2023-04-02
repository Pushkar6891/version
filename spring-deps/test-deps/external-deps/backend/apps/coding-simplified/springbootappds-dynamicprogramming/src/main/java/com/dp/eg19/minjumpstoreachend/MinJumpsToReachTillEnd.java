package com.dp.eg19.minjumpstoreachend;

public class MinJumpsToReachTillEnd {

	public static int minJumpsToReachTillEnd(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}

		int[] minJumps = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			minJumps[i] = Integer.MAX_VALUE;
		}

		minJumps[0] = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j <= i + arr[i] && j < arr.length; j++) {
				minJumps[j] = Math.min(minJumps[j], 1 + minJumps[i]);
			}
		}

		return minJumps[arr.length - 1];
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 3, 2, 1, 2, 1 };

		System.out.println(MinJumpsToReachTillEnd.minJumpsToReachTillEnd(arr));
	}
}