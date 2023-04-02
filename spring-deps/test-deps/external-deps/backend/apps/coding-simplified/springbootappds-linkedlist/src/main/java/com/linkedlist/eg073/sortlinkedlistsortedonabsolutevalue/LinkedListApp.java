package com.linkedlist.eg073.sortlinkedlistsortedonabsolutevalue;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It sort the two Linked Lists which is already sorted on absolute value
	 */
	public Node sortWhichIsSortedOnAbsoluteValue(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node node, next, prev;

		node = next = head;
		prev = null;

		if (head.data < 0) {
			prev = node;
			node = node.next;
		}

		while (node != null) {
			if (node.data < 0) {
				prev.next = node.next;
				next = node.next;
				node.next = head;
				head = node;
				node = next;
			} else {
				prev = node;
				node = node.next;
			}
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
		Linked a = new Linked();

		Node head = null;

		head = a.insert(1, head);
		head = a.insert(-3, head);
		head = a.insert(10, head);
		head = a.insert(-13, head);
		head = a.insert(-23, head);
		head = a.insert(16, head);

		head = a.sortWhichIsSortedOnAbsoluteValue(head);
		a.printList(head);
	}
}