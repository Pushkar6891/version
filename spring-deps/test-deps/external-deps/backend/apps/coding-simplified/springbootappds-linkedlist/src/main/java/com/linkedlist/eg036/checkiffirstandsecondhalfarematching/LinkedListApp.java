package com.linkedlist.eg036.checkiffirstandsecondhalfarematching;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It'll check if 1st & 2nd half is matching in linked list
	 */
	public boolean ifFirstSecondHalfMatching(Node node) {
		if (node == null || node.next == null) {
			return true;
		}

		Node slow, fast;
		slow = fast = node;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node secondHalf = slow.next;

		while (secondHalf != null) {
			if (node.data != secondHalf.data) {
				return false;
			}

			node = node.next;
			secondHalf = secondHalf.next;
		}

		return true;
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
		head = a.insert(37, head);
		head = a.insert(12, head);
		head = a.insert(99, head);
		head = a.insert(37, head);

		a.printList(head);
		System.out.println();

		System.out.println(a.ifFirstSecondHalfMatching(head));
	}
}