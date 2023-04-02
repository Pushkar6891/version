package com.linkedlist.eg001.creationlinkedlistusingrecursionapproach;

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
class LinkedList {
	Node root;

	public LinkedList() {
		root = null;
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
		else
			node.next = insert(node.next, key);

		return node;
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

/*
 * LinkedList class to initiate the operation.
 */
public class LinkedListApp {

	public static void main(String[] args) {

		Node root = null;
		LinkedList obj = new LinkedList();
		root = obj.insert(root, 1);
		root = obj.insert(root, 2);
		root = obj.insert(root, 3);
		root = obj.insert(root, 4);

		obj.printList(root);

	}
}