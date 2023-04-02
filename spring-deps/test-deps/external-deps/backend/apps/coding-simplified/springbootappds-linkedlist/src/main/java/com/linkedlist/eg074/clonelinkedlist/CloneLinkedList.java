package com.linkedlist.eg074.clonelinkedlist;

import java.util.HashMap;

class Node {
	Node next;
	Node random;
	int data;
}

class LinkedList {
	public Node createNewNode(int i) {
		Node a = new Node();
		a.data = i;
		a.next = null;
		a.random = null;
		return a;
	}

	public Node clone(Node node) {
		if (node == null) {
			return node;
		}

		Node first = node;
		Node next = null;

		while (node != null) {
			Node newNode = createNewNode(node.data);
			next = node.next;
			node.next = newNode;
			newNode.next = next;

			node = next;
		}

		node = first;

		while (node != null) {
			node.next.random = node.random.next;
			node = node.next != null ? node.next.next : node.next;
		}

		node = first;
		Node copy = node.next;
		Node tempCopy = copy;

		while (node != null && copy != null) {
			node.next = node.next != null ? node.next.next : node.next;
			copy.next = copy.next != null ? copy.next.next : copy.next;

			node = node.next;
			copy = copy.next;
		}

		return tempCopy;
	}

	public Node cloneUsingHashmap(Node firstHead) {
		if (firstHead == null) {
			return null;
		}

		HashMap<Node, Node> m = new HashMap<>();
		Node secondHead = null, secondNode = null;
		Node firstNode = firstHead;

		while (firstNode != null) {
			Node newNode = createNewNode(firstNode.data);
			if (secondHead == null) {
				secondHead = newNode;
				secondNode = secondHead;
			} else {
				secondNode.next = newNode;
				secondNode = newNode;
			}

			m.put(firstNode, secondNode);
			firstNode = firstNode.next;
		}

		firstNode = firstHead;
		secondNode = secondHead;

		while (firstNode != null) {
			if (firstNode.random != null) {
				secondNode.random = m.get(firstNode.random);
			}

			firstNode = firstNode.next;
			secondNode = secondNode.next;
		}

		return secondHead;
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

public class CloneLinkedList {

	public static void main(String[] args) {

		LinkedList a = new LinkedList();

		Node head = a.createNewNode(1);
		head.next = a.createNewNode(2);
		head.next.next = a.createNewNode(3);
		head.next.next.next = a.createNewNode(4);
		head.next.next.next.next = a.createNewNode(5);

		head.random = head.next.next;
		head.next.random = head;
		head.next.next.random = head.next.next.next.next;
		head.next.next.next.random = head.next.next.next.next;
		head.next.next.next.next.random = head.next;

		System.out.println("Original:");
		a.printList(head);

		// Node clone = a.clone(head);
		Node clone2 = a.cloneUsingHashmap(head);

		System.out.println("\nCloned List:");
		a.printList(clone2);
	}

}