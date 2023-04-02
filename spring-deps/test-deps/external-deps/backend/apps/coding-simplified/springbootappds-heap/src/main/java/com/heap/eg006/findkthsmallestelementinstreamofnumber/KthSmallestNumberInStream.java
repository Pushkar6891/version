package com.heap.eg006.findkthsmallestelementinstreamofnumber;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestNumberInStream {
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

	public int add(int num, int k) {
		if (maxHeap.size() < k) {
			maxHeap.add(num);
			return maxHeap.size() == k ? maxHeap.peek() : -1;
		}

		if (num < maxHeap.peek()) {
			maxHeap.poll();
			maxHeap.add(num);
		}

		return maxHeap.peek();
	}

	public static void main(String[] args) {
		KthSmallestNumberInStream a = new KthSmallestNumberInStream();

		int[] arr = new int[] { 10, 7, 11, 5, 27, 3, 2, 1 };
		int k = 3;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(a.add(arr[i], k));
		}

	}
}