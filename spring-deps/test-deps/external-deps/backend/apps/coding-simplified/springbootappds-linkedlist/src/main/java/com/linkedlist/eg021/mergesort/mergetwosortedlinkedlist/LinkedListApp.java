package com.linkedlist.eg021.mergesort.mergetwosortedlinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It'll merge two Sorted linked list
	 */
	public Node mergeSortedList(Node a, Node b) {
		return merge(a, b);
	}

	/*
	 * It'll merge both linked list
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

		Node head1 = null;
		Linked a = new Linked();

		head1 = a.insert(3, head1);
		head1 = a.insert(8, head1);
		head1 = a.insert(13, head1);

		Node head2 = null;
		head2 = a.insert(4, head2);
		head2 = a.insert(14, head2);

		a.printList(head1);
		System.out.println();

		a.printList(head2);
		System.out.println();

		Node mergeList = a.mergeSortedList(head1, head2);
		a.printList(mergeList);

	}
}