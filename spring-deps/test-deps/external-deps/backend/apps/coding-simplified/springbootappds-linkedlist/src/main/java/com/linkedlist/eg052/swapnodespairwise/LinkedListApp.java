package com.linkedlist.eg052.swapnodespairwise;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It swaps the nodes pairwise in linked list
	 */
	public Node pairwiseSwapNodeLinks(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node head = node.next;

		Node prev = node;
		node = node.next;
		Node next;

		while (node != null) {
			next = node.next;
			node.next = prev;

			if (next == null || next.next == null) {
				prev.next = next;
				break;
			}

			prev.next = next.next;

			prev = next;
			node = prev.next;
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

		Node head = null;
		Linked a = new Linked();

		head = a.insert(12, head);
		head = a.insert(99, head);
		head = a.insert(8, head);
		head = a.insert(39, head);
		head = a.insert(5, head);
		head = a.insert(70, head);
		head = a.insert(25, head);

		a.printList(head);
		System.out.println();

		head = a.pairwiseSwapNodeLinks(head);

		a.printList(head);
		System.out.println();

	}
}