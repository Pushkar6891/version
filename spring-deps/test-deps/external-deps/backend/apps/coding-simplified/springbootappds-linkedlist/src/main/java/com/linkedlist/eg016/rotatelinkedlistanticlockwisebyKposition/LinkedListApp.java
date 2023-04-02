package com.linkedlist.eg016.rotatelinkedlistanticlockwisebyKposition;

class Node {
	Node next;
	int data;
}

class Linked {

	/*
	 * It'll rotate the linked list anticlockwise by k node
	 */
	public Node rotateAntiClockwise(int k, Node node) {
		if (node == null || k < 0) {
			return node;
		}

		int sizeOfLinkedList = getSizeOfList(node);
		k = k % sizeOfLinkedList;
		if (k == 0) {
			return node;
		}

		Node tmp = node;
		int i = 1;

		while (i < k) {
			tmp = tmp.next;
			i++;
		}

		Node temp = tmp.next;
		Node head = temp;
		tmp.next = null;

		i = 1;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;
		return head;
	}

	public int getSizeOfList(Node node) {
		if (node == null) {
			return 0;
		}

		return 1 + getSizeOfList(node.next);
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
		root = a.insert(8, root);
		root = a.insert(18, root);

		a.printList(root);
		System.out.println();

		root = a.rotateAntiClockwise(2, root);
		a.printList(root);
		System.out.println();

	}
}