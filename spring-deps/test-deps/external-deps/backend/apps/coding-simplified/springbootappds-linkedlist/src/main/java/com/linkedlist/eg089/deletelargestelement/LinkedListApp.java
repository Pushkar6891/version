package com.linkedlist.eg089.deletelargestelement;

class Node {
	Node next;
	int data;
}

class Linked {

	public Node deleteLargestElement(Node node) {
		if (node == null || node.next == null) {
			return null;
		}

		Node prevLargest, largest, head, prev;
		head = largest = node;
		prevLargest = null;
		prev = node;
		node = node.next;

		while (node != null) {
			if (node.data > largest.data) {
				prevLargest = prev;
				largest = node;
			}

			prev = node;
			node = node.next;
		}

		if (head == largest) {
			head = head.next;
		} else {
			prevLargest.next = largest.next;
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

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

		System.out.println();
	}
}

public class LinkedListApp {
	public static void main(String[] args) {
		Linked a = new Linked();

		Node head = null;
		head = a.insert(10, head);
		head = a.insert(7, head);
		head = a.insert(6, head);
		head = a.insert(80, head);
		head = a.insert(8, head);
		head = a.insert(-1, head);

		a.printList(head);

		head = a.deleteLargestElement(head);

		a.printList(head);

	}
}