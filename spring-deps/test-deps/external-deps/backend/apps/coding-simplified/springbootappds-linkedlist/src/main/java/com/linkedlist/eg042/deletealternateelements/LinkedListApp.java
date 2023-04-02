package com.linkedlist.eg042.deletealternateelements;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It delete alternate node of linked list
	 */
	public Node deleteAlternateNode(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node head = node;

		while (node != null && node.next != null) {
			node.next = node.next.next;
			node = node.next;
		}

		return head;
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

		a.printList(head);
		System.out.println();

		head = a.deleteAlternateNode(head);

		a.printList(head);

	}
}