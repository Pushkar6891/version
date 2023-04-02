package com.linkedlist.eg049.reverselinkedlistalternativelyingroupofK;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It reverses the linked list alternatively in group of K
	 */
	public Node reverseAlternativelyInGroup(Node head, int k) {
		if (k <= 1 || head == null || head.next == null) {
			return head;
		}
		Node prev, next;
		prev = next = null;

		Node node = head;

		int i = 0;

		while (node != null && i < k) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
			i++;
		}

		i = 0;
		if (next != null) {
			head.next = next;
			node = next;
			while (node != null && i < k - 1) {
				node = node.next;
				i++;
			}
			if (node != null) {
				node.next = reverseAlternativelyInGroup(node.next, k);
			}
		}

		return prev;
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

		head = a.reverseAlternativelyInGroup(head, 2);

		a.printList(head);
	}
}