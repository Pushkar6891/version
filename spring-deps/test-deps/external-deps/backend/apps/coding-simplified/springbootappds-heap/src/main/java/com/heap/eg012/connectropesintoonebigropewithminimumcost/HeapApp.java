package com.heap.eg012.connectropesintoonebigropewithminimumcost;

import java.util.PriorityQueue;

public class HeapApp {

	public static int connectRopeWithMinimumCost(int[] ropes) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int i = 0; i < ropes.length; i++) {
			minHeap.add(ropes[i]);
		}

		int minCost = 0;

		while (minHeap.size() > 1) {

			int tempCost = minHeap.poll() + minHeap.poll();
			minCost = minCost + tempCost;

			minHeap.add(tempCost);
		}

		return minCost;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 7, 2 };
		System.out.println(HeapApp.connectRopeWithMinimumCost(arr));
	}
	
	// 2,3,4,7	=> 5
	// 5,4,7	=> 9
	// 9,7		=> 16
	// 5 + 9 + 16 = 30
}