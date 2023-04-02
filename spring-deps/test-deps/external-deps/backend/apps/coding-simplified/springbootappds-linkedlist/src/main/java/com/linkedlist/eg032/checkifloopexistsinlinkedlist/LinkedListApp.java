package com.linkedlist.eg032.checkifloopexistsinlinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * Check if loop present in linked list
	 */
	public boolean ifLoopPresent(Node node) {
		if (node == null) {
			return false;
		}

		Node slow, fast;

		slow = fast = node;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow.data == fast.data) {
				return true;
			}
		}

		return false;
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
		head = a.insert(5, head);
		head = a.insert(25, head);

		head.next.next.next.next.next = head.next;

		System.out.println(a.ifLoopPresent(head));
	}
}