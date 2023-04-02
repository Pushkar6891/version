package com.linkedlist.eg007.insertelementatgivenpositionusingiterativeapproach;

class Node {
	int data;
	Node next;
}

class LinkedList {

	private Node getNewNode(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;

		return newNode;
	}

	public Node insertElementAtPosition(Node node, int val, int position) {
		if (position < 1) {
			System.out.println("Position can't be less than 1");
			return node;
		}

		if (node == null && position > 1) {
			System.out.println("Position greater than number of elements exists");
			return node;
		}

		if (node == null && position == 1) {
			return getNewNode(val);
		}

		if (position == 1) {
			Node newNode = getNewNode(val);
			newNode.next = node;

			return newNode;
		}

		Node firstNode = node;
		Node prev = null;

		while (node != null && position > 1) {
			prev = node;
			node = node.next;
			position--;
		}

		if (position != 1) {
			System.out.println("Position greater than number of elements exists");
			return firstNode;
		}

		Node newNode = getNewNode(val);
		prev.next = newNode;
		newNode.next = node;

		return firstNode;
	}

	public Node insert(Node node, int val) {
		if (node == null) {
			return getNewNode(val);
		}

		Node firstNode = node;

		while (node.next != null) {
			node = node.next;
		}

		node.next = getNewNode(val);
		return firstNode;
	}

	public void printList(Node node) {
		if (node == null) {
			return;
		}

		while (node != null) {
			System.out.print(node.data + " ");

			node = node.next;
		}
	}
}

public class LinkedListApp {

	public static void main(String[] args) {

		LinkedList obj = new LinkedList();
		Node head = null;

		head = obj.insert(head, 12);
		head = obj.insert(head, 7);
		head = obj.insert(head, 8);
		head = obj.insert(head, 10);

		head = obj.insertElementAtPosition(head, 30, -1);

		obj.printList(head);

	}

}