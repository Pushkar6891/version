package com.heap.eg004.findkthlargestelementinstreamofnumber;

import java.util.PriorityQueue;

public class KthLargestNumberInStream {
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	public int add(int num, int k) {
		if (minHeap.size() < k) {
			minHeap.add(num);
			return minHeap.size() == k ? minHeap.peek() : -1;
		}

		if (num > minHeap.peek()) {
			minHeap.poll();
			minHeap.add(num);
		}

		return minHeap.peek();
	}

	public static void main(String[] args) {
		KthLargestNumberInStream a = new KthLargestNumberInStream();

		int[] arr = new int[] { 10, 7, 11, 5, 27, 8, 9, 45 };
		int k = 3;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(a.add(arr[i], k));
		}

	}
}