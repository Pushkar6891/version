package com.linkedlist.eg090.reverselinkedlistbetweengivenposition;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It reverses the linked list iteratively
	 */
	public Node reverseFromGivenPositions(Node node, int p, int q) {
		if (node == null || node.next == null || p >= q || p < 1 || q < 1) {
			return node;
		}

		Node head = node;
		Node prev = null;

		for (int i = 1; node != null && i < p; i++) {
			prev = node;
			node = node.next;
		}

		if (node == null) {
			return head;
		}

		Node firstPartLastNode = prev;
		Node secondPartStartNode = node;
		Node next = null;

		for (int i = 0; node != null && i <= q - p; i++) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}

		if (p != 1) {
			firstPartLastNode.next = prev;
		}

		secondPartStartNode.next = node;

		return p == 1 ? prev : head;

	}

	/*
	 * getNewNode() method to generate a new node
	 */
	public Node getNewNode(int key) {
		Node a = new Node();
		a.next = null;
		a.data = key;
		return a;
	}

	/*
	 * insert method is used to insert the element in Linked List
	 */
	public Node insert(int key, Node node) {

		if (node == null)
			return getNewNode(key);
		else
			node.next = insert(key, node.next);

		return node;
	}

	/*
	 * It'll print the complete linked list
	 */
	public void printList(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		printList(node.next);
	}
}

public class LinkedListApp {

	public static void main(String[] args) {

		Node head = null;
		Linked a = new Linked();

		head = a.insert(12, head);
		head = a.insert(99, head);
		head = a.insert(8, head);
		head = a.insert(39, head);
		head = a.insert(5, head);
		head = a.insert(16, head);
		head = a.insert(20, head);

		a.printList(head);
		System.out.println();

		head = a.reverseFromGivenPositions(head, 2, 5);

		a.printList(head);
	}
}