package com.linkedlist.eg070.removeeveryKthnode;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It removes every Kth node in linked list
	 */
	public Node removeEveryKthNode(Node node, int k) {
		if (node == null || k <= 1) {
			return null;
		}

		if (node.next == null && k > 1) {
			System.out.println("Not a valid case");
			return node;
		}

		Node head = node;
		int i = 1;

		while (node != null && node.next != null) {
			if (i % (k - 1) == 0) {
				node.next = node.next.next;
			}

			node = node.next;
			i++;
		}

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

		head = a.removeEveryKthNode(head, 2);
		a.printList(head);
	}
}