package com.linkedlist.eg026.removeduplicatesfromunsortedlinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It'll remove duplicate from linked list
	 */
	public Node removeDuplicate(Node node) {
		if (node == null) {
			return node;
		}

		node = mergeSort(node);
		return removeDuplicateSortedList(node);
	}

	private Node removeDuplicateSortedList(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		if (node.data == node.next.data) {
			node.next = node.next.next;
			removeDuplicateSortedList(node);
		} else {
			removeDuplicateSortedList(node.next);
		}

		return node;
	}

	/*
	 * It'll sort the linked list
	 */
	public Node mergeSort(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node middle = middleNode(node);
		Node secondHalf = middle.next;
		middle.next = null;

		return merge(mergeSort(node), mergeSort(secondHalf));
	}

	/*
	 * It'll return the middle node of linked list
	 */
	public Node middleNode(Node node) {
		if (node == null) {
			return null;
		}

		Node a = node;
		Node b = node.next;

		while (b != null && b.next != null) {
			a = a.next;
			b = b.next.next;
		}

		return a;
	}

	/*
	 * It'll merge two linked list
	 */
	public Node merge(Node a, Node b) {
		Node temp = new Node();
		Node finalList = temp;

		while (a != null && b != null) {
			if (a.data < b.data) {
				temp.next = a;
				a = a.next;
			} else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}
		temp.next = (a == null) ? b : a;
		return finalList.next;
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

		head = a.insert(18, head);
		head = a.insert(8, head);
		head = a.insert(34, head);
		head = a.insert(13, head);
		head = a.insert(34, head);
		head = a.insert(8, head);
		head = a.insert(37, head);
		head = a.insert(8, head);

		a.printList(head);
		System.out.println();

		head = a.removeDuplicate(head);

		a.printList(head);
		System.out.println();
	}
}