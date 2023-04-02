package com.linkedlist.eg003.printelementsoflinkedlistusingrecursionapproach;

/* 
 * Node class contains the LinkedList Node Structure. (int Data & a reference point)  
 */
class Node {
	Node next;
	int data;
}

/*
 * Linked class contains the necessary functions to make the operations.
 */
class Linked {
	Node root;

	public Linked() {
		root = null;
	}

	/*
	 * printLinkedList() method is used to print the Linked List (nodes)
	 */
	public void printLinkedList(Node node) {
		if (node == null)
			return;

		System.out.print(node.data + " ");
		printLinkedList(node.next);
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
	public Node insert(Node node, int key) {

		if (node == null)
			return getNewNode(key);
		node.next = insert(node.next, key);

		return node;
	}
}

/*
 * LinkedList class to initiate the operation.
 */
public class LinkedListApp {

	public static void main(String[] args) {
		Node root = null;
		Linked a = new Linked();
		root = a.insert(root, 70);
		root = a.insert(root, 20);
		root = a.insert(root, 33);
		root = a.insert(root, 46);
		root = a.insert(root, 56);

		a.printLinkedList(root);
	}
}