package com.queue.eg01.queueimplusingarray;

class Queue {
	int MAX = 5;
	int front = 0;
	int rear = -1;
	int size = 0;
	int[] a = new int[MAX];

	private boolean isFull() {
		if (size == MAX) {
			return true;
		}

		return false;
	}

	public void insert(int val) {
		if (isFull()) {
			System.out.println("Queue is full. Remove some elements");
			return;
		}
		rear = (rear + 1) % MAX;
		size++;
		a[rear] = val;
	}

	public boolean ifEmpty() {
		if (size == 0) {
			return true;
		}

		return false;
	}

	public int remove() {
		if (ifEmpty()) {
			System.out.println("Queue is empty. Nothing to remove");
			return Integer.MIN_VALUE;
		}
		front = front % MAX;
		size--;
		return a[front++];
	}

	public int getSize() {
		return size;
	}

	public int getFront() {
		if (ifEmpty()) {
			System.out.println("Queue is Empty. Nothing at Front");
			return Integer.MIN_VALUE;
		}
		return a[front];
	}

	public int getRear() {
		if (ifEmpty()) {
			System.out.println("Queue is Empty. Nothing at Rear");
			return Integer.MIN_VALUE;
		}
		return a[rear];
	}
}

public class QueueArrayImplementation {

	public static void main(String[] args) {
		Queue a = new Queue();
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
		a.insert(80);

		System.out.println("Size: " + a.getSize());
		System.out.println("Front: " + a.getFront());
		System.out.println("Rear: " + a.getRear());

		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());
		System.out.println("Removed Element: " + a.remove());
	}

}