package com.linkedlist.eg025.removeduplicatesfromsortedlinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It'll remove duplicate from Sorted linked list
	 */
	public Node removeDuplicateSortedList(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		if (node.data == node.next.data) {
			node.next = node.next.next;
			removeDuplicateSortedList(node);
		} else {
			removeDuplicateSortedList(node.next);
		}

		return node;
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

		head = a.insert(8, head);
		head = a.insert(8, head);
		head = a.insert(8, head);
		head = a.insert(13, head);
		head = a.insert(18, head);
		head = a.insert(34, head);
		head = a.insert(34, head);
		head = a.insert(37, head);

		a.printList(head);
		System.out.println();

		head = a.removeDuplicateSortedList(head);

		a.printList(head);
		System.out.println();
	}
}