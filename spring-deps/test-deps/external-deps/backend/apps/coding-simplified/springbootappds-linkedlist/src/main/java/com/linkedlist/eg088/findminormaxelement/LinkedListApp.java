package com.linkedlist.eg088.findminormaxelement;

class Node {
	Node next;
	int data;
}

class Linked {

	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;

	public void getMaxMin(Node node) {
		if (node == null) {
			System.out.println("List is blank");
			return;
		}

		while (node != null) {
			if (node.data > max) {
				max = node.data;
			}

			if (node.data < min) {
				min = node.data;
			}

			node = node.next;
		}
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
		head = a.insert(1, head);
		head = a.insert(7, head);
		head = a.insert(8, head);
		head = a.insert(2, head);
		head = a.insert(-1, head);

		a.getMaxMin(head);

		System.out.println("Max element: " + a.max);
		System.out.println("Min element: " + a.min);

	}
}