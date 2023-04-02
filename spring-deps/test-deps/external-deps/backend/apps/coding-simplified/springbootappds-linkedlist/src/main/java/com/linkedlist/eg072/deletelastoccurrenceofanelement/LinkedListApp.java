package com.linkedlist.eg072.deletelastoccurrenceofanelement;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It deletes the last occurrence of an item in linked list
	 */
	public Node deleteLastOccurrenceOfItem(Node node, int val) {
		if (node == null) {
			return null;
		}

		Node head, temp;

		head = node;
		temp = null;

		while (node != null) {
			if (node.data == val) {
				temp = node;
			}

			node = node.next;
		}

		if (temp == null) {
			return head;
		}

		if (temp == head) {
			return head.next;
		}

		if (temp.next == null) {
			node = head;
			while (node.next.next != null) {
				node = node.next;
			}
			node.next = null;
			return head;
		}

		temp.data = temp.next.data;
		temp.next = temp.next.next;

		return head;
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
		head = a.insert(13, head);
		head = a.insert(8, head);

		head = a.deleteLastOccurrenceOfItem(head, 13);
		a.printList(head);
	}
}