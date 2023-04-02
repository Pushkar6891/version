package com.linkedlist.eg006.insertelementatgivenpositionusingrecursiveapproach;

class Node {
	Node next;
	int data;
}

class Linked {

	/*
	 * It'll insert given element at given position
	 */
	public Node insertAtPosition(int i, int position, Node node) {
		if (position < 0) {
			System.out.println("Position can't be less than 1");
		}

		if (node == null && position > 1) {
			System.out.println("Position is greater than element exists");
			return node;
		}

		if (node == null && position == 1) {
			return getNewNode(i);
		}

		if (position == 1) {
			Node newNode = getNewNode(i);
			newNode.next = node;
			return newNode;
		}

		node.next = insertAtPosition(i, position - 1, node.next);
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

		Node root = null;
		Linked a = new Linked();

		root = a.insert(12, root);
		root = a.insert(99, root);
		root = a.insert(37, root);

		System.out.println("Before insertion :");
		a.printList(root);
		
		root = a.insertAtPosition(5, 2, root);

		System.out.println("\nAfter insertion :");
		a.printList(root);

	}
}