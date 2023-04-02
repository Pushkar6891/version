package com.linkedlist.eg062.countrotationsinsortedandrotatedlinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It counts rotations in Sorted & Rotated in Linked list
	 */
	public int countRotationInSortedRotatedList(Node node) {
		if (node == null || node.next == null) {
			return 0;
		}

		int count = 0;
		while (node.next != null) {
			if (node.data < node.next.data) {
				count++;
			} else {
				break;
			}

			node = node.next;
		}

		if (node.next == null) {
			return 0;
		} else {
			return count + 1;
		}

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
		head = a.insert(38, head);
		head = a.insert(1, head);
		head = a.insert(7, head);
		head = a.insert(13, head);

		a.printList(head);
		System.out.println();

		System.out.println(a.countRotationInSortedRotatedList(head));
	}
}