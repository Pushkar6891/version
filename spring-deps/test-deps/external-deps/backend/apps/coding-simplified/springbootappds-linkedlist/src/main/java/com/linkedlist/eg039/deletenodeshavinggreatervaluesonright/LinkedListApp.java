package com.linkedlist.eg039.deletenodeshavinggreatervaluesonright;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It maintains that all value on right of a element is smaller than the current
	 * element in the linked list
	 */
	public Node deleteGreaterValuesOnRight(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node reverse = this.reverse(node);
		Node tmp = reverse;
		int max = tmp.data;

		while (tmp.next != null) {
			if (tmp.next.data > max) {
				max = tmp.next.data;
				tmp = tmp.next;
			} else {
				tmp.next = tmp.next.next;
			}
		}

		node = this.reverse(reverse);

		return node;
	}

	/*
	 * It reverses the Linked list
	 */
	public Node reverse(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node temp = reverse(node.next);
		node.next.next = node;
		node.next = null;

		return temp;

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

		a.printList(head);
		System.out.println();

		head = a.deleteGreaterValuesOnRight(head);

		a.printList(head);
	}
}