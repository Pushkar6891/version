package com.linkedlist.eg053.mergetwolinkedlistalternatively;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It merges two linked list alternatively
	 */
	Node first, second;

	public void mergeTwoListAlternatively(Node node1, Node node2) {

		Node node1next, node2next;
		first = node1;
		second = node2;

		while (node1 != null && node2 != null) {
			node1next = node1.next;
			node1.next = node2;
			node1 = node1next;

			node2next = node2.next;
			node2.next = node1next;
			node2 = node2next;
		}

		second = node2;
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
		Node head1 = null;
		Linked a = new Linked();

		head1 = a.insert(12, head1);
		head1 = a.insert(99, head1);
		head1 = a.insert(8, head1);
		head1 = a.insert(39, head1);

		Node head2 = null;
		head2 = a.insert(5, head2);
		head2 = a.insert(70, head2);

		a.printList(head1);
		System.out.println();

		a.printList(head2);
		System.out.println();

		a.mergeTwoListAlternatively(head1, head2);

		a.printList(a.first);
	}
}