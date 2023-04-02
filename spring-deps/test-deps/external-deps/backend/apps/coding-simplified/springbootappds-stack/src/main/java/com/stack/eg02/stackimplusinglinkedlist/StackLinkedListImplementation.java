package com.stack.eg02.stackimplusinglinkedlist;

class Node {
	int data;
	Node next;
}

class StackLinked {
	Node front;

	public Node getNewNode(int val) {
		Node a = new Node();
		a.data = val;
		a.next = null;
		return a;
	}

	public void push(int val) {
		if (front == null) {
			front = getNewNode(val);
			return;
		}

		Node t = getNewNode(val);
		t.next = front;
		front = t;
	}

	public int pop() {
		if (front == null) {
			System.out.println("Stack is Empty");
			return Integer.MIN_VALUE;
		}

		int t = front.data;
		front = front.next;
		return t;
	}

	public int top() {
		if (front == null) {
			System.out.println("Stack is Empty");
			return Integer.MIN_VALUE;
		}

		return front.data;
	}
}

public class StackLinkedListImplementation {

	public static void main(String[] args) {
		StackLinked a = new StackLinked();
		a.push(12);
		a.push(5);
		a.push(34);
		a.push(42);
		a.push(91);
		a.push(9);

		System.out.println(a.pop());
		a.push(39);

		System.out.println("Top:" + a.top());

		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());

	}

}