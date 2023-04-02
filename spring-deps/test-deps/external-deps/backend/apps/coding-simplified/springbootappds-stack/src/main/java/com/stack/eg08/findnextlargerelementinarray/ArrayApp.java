package com.stack.eg08.findnextlargerelementinarray;

import java.util.Stack;

class ArrayImpl {

	public void printNextLargerElements(int arr[]) {
		if (arr.length == 0) {
			return;
		}

		Stack<Integer> s = new Stack<>();

		s.push(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			while (!s.isEmpty() && arr[i] > s.peek()) {
				s.pop();
				System.out.print(arr[i] + " ");
			}

			s.push(arr[i]);
		}

		while (!s.isEmpty()) {
			System.out.println(-1);
			s.pop();
		}
	}

}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { 1, 4, 2, 6, 1, 8 };

		a.printNextLargerElements(arr);

	}
}