package com.linkedlist.eg060.makemiddlenodeasheadoflinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It makes middle node as head of Linked
	 */
	public Node makeMiddleNodeHead(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node slow, fast, head, prev;
		slow = fast = head = prev = node;

		while (fast.next != null && fast.next.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		prev.next = slow.next;
		slow.next = head;
		head = slow;

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
		head = a.insert(12, head);
		head = a.insert(7, head);
		head = a.insert(13, head);
		head = a.insert(22, head);
		head = a.insert(8, head);

		a.printList(head);
		System.out.println();

		head = a.makeMiddleNodeHead(head);

		a.printList(head);
	}
}