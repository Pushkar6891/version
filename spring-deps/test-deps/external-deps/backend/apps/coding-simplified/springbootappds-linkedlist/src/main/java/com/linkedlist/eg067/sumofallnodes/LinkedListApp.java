package com.linkedlist.eg067.sumofallnodes;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It gets sum of nodes in linked list
	 */
	public int getSumOfNodes(Node node) {
		if (node == null) {
			return 0;
		}

		int sum = 0;
		while (node != null) {
			sum = sum + node.data;
			node = node.next;
		}

		return sum;
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

		head = a.insert(22, head);
		head = a.insert(3, head);
		head = a.insert(10, head);
		head = a.insert(13, head);
		head = a.insert(23, head);
		head = a.insert(6, head);

		System.out.println(a.getSumOfNodes(head));
	}
}