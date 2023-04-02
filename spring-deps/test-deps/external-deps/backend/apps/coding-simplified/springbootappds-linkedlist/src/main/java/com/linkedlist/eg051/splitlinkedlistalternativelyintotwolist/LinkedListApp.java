package com.linkedlist.eg051.splitlinkedlistalternativelyintotwolist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It separates the linked list into two part with alternate elements
	 */
	Node firstHead, secondHead;

	public void alternateSplit(Node node) {
		if (node == null || node.next == null) {
			return;
		}

		Node firstTemp;
		Node secondTemp;

		firstHead = firstTemp = node;
		secondHead = secondTemp = node.next;
		node = node.next.next;

		while (node != null && node.next != null) {
			firstTemp.next = node;
			secondTemp.next = node.next;

			firstTemp = firstTemp.next;
			secondTemp = secondTemp.next;

			node = node.next.next;
		}

		if (node != null) {
			firstTemp.next = node;
			firstTemp = firstTemp.next;
		}

		firstTemp.next = null;
		secondTemp.next = null;

		return;
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
		head = a.insert(70, head);
		head = a.insert(25, head);

		a.printList(head);
		System.out.println();

		a.alternateSplit(head);

		a.printList(a.firstHead);
		System.out.println();

		a.printList(a.secondHead);
	}
}