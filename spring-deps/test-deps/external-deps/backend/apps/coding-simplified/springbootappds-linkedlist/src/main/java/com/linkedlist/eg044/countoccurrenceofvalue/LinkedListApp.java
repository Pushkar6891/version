package com.linkedlist.eg044.countoccurrenceofvalue;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It returns the count of a value in linked list
	 */
	public int getCountOfValue(Node node, int val) {
		if (node == null) {
			return -1;
		}

		int count = 0;

		while (node != null) {
			if (node.data == val) {
				count++;
			}

			node = node.next;
		}

		return count;
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
		head = a.insert(12, head);
		head = a.insert(99, head);
		head = a.insert(8, head);
		head = a.insert(39, head);
		head = a.insert(5, head);
		head = a.insert(8, head);

		a.printList(head);
		System.out.println();

		System.out.println(a.getCountOfValue(head, 8));

	}
}