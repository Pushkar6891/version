package com.linkedlist.eg035.deletemiddleelementoflinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It'll delete middle node in linked list
	 */
	public Node deleteMiddleNode(Node node) {
		if (node == null || node.next == null) {
			return null;
		}

		Node slow, fast, prev;

		slow = fast = prev = node;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		prev.next = slow.next;
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

		head = a.insert(12, head);
		head = a.insert(99, head);
		head = a.insert(37, head);
		head = a.insert(5, head);
		head = a.insert(25, head);

		a.printList(head);
		System.out.println();

		a.deleteMiddleNode(head);

		a.printList(head);
	}
}