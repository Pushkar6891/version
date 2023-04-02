package com.linkedlist.eg071.deletenodewhenheadnodeisnotgiven;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It deletes the only given node in linked list
	 */
	public void deleteOnlyGivenNode(Node node) {
		if (node == null || node.next == null) {
			return;
		}

		node.data = node.next.data;
		node.next = node.next.next;
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
		Linked a = new Linked();

		Node head = null;

		head = a.insert(22, head);
		head = a.insert(3, head);
		head = a.insert(10, head);
		head = a.insert(13, head);
		head = a.insert(23, head);
		head = a.insert(6, head);

		a.deleteOnlyGivenNode(head.next.next.next);
		a.printList(head);
	}
}