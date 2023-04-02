package com.linkedlist.eg079.flattenmultilevellinkedlistdepthwise;

class Node {
	Node next;
	Node down;
	int data;
}

class LinkedListApp {
	public Node newNode(int i) {
		Node a = new Node();
		a.data = i;
		a.next = null;
		a.down = null;
		return a;
	}

	Node prev;

	public Node flattenEasy(Node node) {
		if (node == null) {
			return null;
		}

		prev = node;

		Node next = node.next;

		if (node.down != null) {
			node.next = flattenEasy(node.down);
		}

		if (next != null) {
			prev.next = flattenEasy(next);
		}
		return node;
	}

	public void printList(Node node) {
		if (node == null) {
			return;
		}

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}

public class FlattenAppLevelWise {

	public static void main(String[] args) {

		LinkedListApp a = new LinkedListApp();

		Node head = a.newNode(1);

		head.next = a.newNode(2);
		head.next.next = a.newNode(3);

		head.next.down = a.newNode(7);
		head.next.down.down = a.newNode(11);
		head.next.down.down.down = a.newNode(13);

		head.next.down.next = a.newNode(8);
		head.next.down.next.down = a.newNode(12);

		a.flattenEasy(head);
		a.printList(head);

	}

}