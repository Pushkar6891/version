package com.linkedlist.eg029.removeduplicatesfromunsortedlinkedlistusinghashmap;

import java.util.HashMap;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * Remove Duplicates from linked lists Using HashMap
	 */
	public Node removeDuplicateUsingHashMap(Node node) {
		if (node == null) {
			return null;
		}

		HashMap<Integer, Integer> s = new HashMap<>();

		Node head = node;
		Node prev = null;
		while (node != null) {
			if (!s.containsKey(node.data)) {
				s.put(node.data, 1);
				prev = node;
				node = node.next;
			} else {
				prev.next = node.next;
				node = node.next;
			}
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
		head = a.insert(12, head);
		head = a.insert(8, head);
		head = a.insert(8, head);

		a.printList(head);
		System.out.println();

		head = a.removeDuplicateUsingHashMap(head);

		a.printList(head);
		System.out.println();
	}
}