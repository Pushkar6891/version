package com.linkedlist.eg023.intersectionoftwolinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It'll get Intersection of two linked list in sorted manner
	 */
	public Node getIntersection(Node a, Node b) {
		a = mergeSort(a);
		b = mergeSort(b);
		return mergeWithIntersection(a, b);
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
	 * It'll merge the two linked list as intersection
	 */
	private Node mergeWithIntersection(Node a, Node b) {
		if (a == null && b == null) {
			return null;
		}

		if (a != null && b == null) {
			return a;
		}

		if (a == null && b != null) {
			return b;
		}

		Node temp = new Node();
		Node finalList = temp;
		while (a != null && b != null) {
			if (a.data < b.data) {
				a = a.next;
			} else if (a.data > b.data) {
				b = b.next;
			} else {
				temp.next = a;
				temp = temp.next;
				a = a.next;
				b = b.next;
			}
		}
		temp.next = null;
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

		head1 = a.insert(37, head1);
		head1 = a.insert(8, head1);
		head1 = a.insert(13, head1);
		head1 = a.insert(18, head1);

		Node head2 = null;
		head2 = a.insert(18, head2);
		head2 = a.insert(14, head2);
		head2 = a.insert(8, head2);

		a.printList(head1);
		System.out.println();

		a.printList(head2);
		System.out.println();

		Node union = a.getIntersection(head1, head2);
		a.printList(union);

	}
}