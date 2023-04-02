package com.stack.eg09.findminimumelementfromstackinO1;

import java.util.Stack;

class ArrayImpl {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	int min = Integer.MAX_VALUE;

	public void pushElementInStack(int val) {
		s1.push(val);

		if (s2.isEmpty()) {
			s2.push(val);
		} else {
			if (val < s2.peek()) {
				s2.push(val);
			}
		}
	}

	public int popElementFromStack() {
		int val = s1.pop();

		if (val == s2.peek()) {
			s2.pop();
		}

		return val;
	}

	public int minElement() {
		if (s2.isEmpty()) {
			return -1;
		}

		return s2.peek();
	}

	Stack<Integer> stack = new Stack<>();
	int minUsingSingleStack = Integer.MAX_VALUE;

	public void pushUsingSingleStack(int val) {
		if (stack.isEmpty()) {
			stack.push(val);
			minUsingSingleStack = val;
			return;
		}

		if (val > minUsingSingleStack) {
			stack.push(val);
		} else {
			stack.push(2 * val - minUsingSingleStack);
			minUsingSingleStack = val;
		}
	}

	public int popUsingSingleStack() {
		if (stack.isEmpty()) {
			return -1;
		}

		int val = stack.pop();

		if (val < minUsingSingleStack) {
			minUsingSingleStack = 2 * minUsingSingleStack - val;
		}

		return val;
	}

	public int getMinElementUsingSingleStack() {
		return minUsingSingleStack;
	}
}

public class ArrayApp {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { 7, 8, 3, 1, 5 };

		for (int i = 0; i < arr.length; i++) {
			a.pushElementInStack(arr[i]);
		}

		System.out.print(a.minElement() + " ");

		a.popElementFromStack();
		System.out.print(a.minElement() + " ");

		a.popElementFromStack();
		System.out.print(a.minElement() + " ");

		a.popElementFromStack();
		System.out.print(a.minElement() + " ");

		a.popElementFromStack();
		System.out.println(a.minElement() + " ");

		// Using Single Stack
		for (int i = 0; i < arr.length; i++) {
			a.pushUsingSingleStack(arr[i]);
		}

		System.out.print(a.getMinElementUsingSingleStack() + " ");

		a.popUsingSingleStack();
		System.out.print(a.getMinElementUsingSingleStack() + " ");

		a.popUsingSingleStack();
		System.out.print(a.getMinElementUsingSingleStack() + " ");

		a.popUsingSingleStack();
		System.out.print(a.getMinElementUsingSingleStack() + " ");

		a.popUsingSingleStack();
		System.out.print(a.getMinElementUsingSingleStack() + " ");

	}
}