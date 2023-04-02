package com.linkedlist.eg014.searchnode;

class Node {
	Node next;
	int data;
}

class Linked {

	/*
	 * It'll check, if given value exists in linked list
	 */
	public boolean ifNodeExists(int val, Node node) {
		if (node == null) {
			return false;
		}

		while (node != null) {
			if (node.data == val) {
				return true;
			}

			node = node.next;
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

		a.printList(root);
		System.out.println();

		System.out.println(a.ifNodeExists(37, root));

	}
}