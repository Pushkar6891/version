package com.queue.eg02.queueimplusinglinkedlist;

class Node {
	int data;
	Node next;
}

class QueueLinked {
	Node first;
	Node last;
	int size;

	public Node getNewNode(int val) {
		Node a = new Node();
		a.data = val;
		a.next = null;
		return a;
	}

	// Complexity: O(1)
	public void insert(int val) {
		if (last == null) {
			first = last = getNewNode(val);
			size++;
			return;
		}
		size++;
		last.next = getNewNode(val);
		last = last.next;
	}

	// Complexity: O(1)
	public boolean ifEmpty() {
		if (last == null) {
			return true;
		}

		return false;
	}

	// Complexity: O(1)
	public int remove() {
		if (ifEmpty()) {
			System.out.println("Queue is empty. Nothing to remove");
			return Integer.MIN_VALUE;
		}
		size--;
		int t = first.data;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return t;
	}

	// Complexity: O(1)
	public int getSize() {
		return size;
	}

	// Complexity: O(1)
	public int getFront() {
		if (ifEmpty()) {
			System.out.println("Queue is Empty. Nothing at Front");
			return Integer.MIN_VALUE;
		}
		return first.data;
	}

	// Complexity: O(1)
	public int getRear() {
		if (ifEmpty()) {
			System.out.println("Queue is Empty. Nothing at Rear");
			return Integer.MIN_VALUE;
		}
		return last.data;
	}
}

public class QueueLinkedListImplementation {

	public static void main(String[] args) {
		QueueLinked a = new QueueLinked();
		a.insert(12);
		a.insert(2);
		a.insert(7);
		a.insert(27);
		a.insert(18);
		a.insert(80);

		System.out.println("Size: " + a.getSize());
		System.out.println("Front: " + a.getFront());
		System.out.println("Rear: " + a.getRear());

		System.out.println("Removed Element: " + a.remove());

		System.out.println("Size: " + a.getSize());
		System.out.println("Front: " + a.getFront());
		System.out.println("Rear: " + a.getRear());
		a.insert(81);

		System.out.println("Size: " + a.getSize());
		System.out.println("Front: " + a.getFront());
		System.out.println("Rear: " + a.getRear());

		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());

	}

}