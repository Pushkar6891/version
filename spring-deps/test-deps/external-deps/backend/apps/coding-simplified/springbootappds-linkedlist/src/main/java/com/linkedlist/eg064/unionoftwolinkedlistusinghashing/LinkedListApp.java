package com.linkedlist.eg064.unionoftwolinkedlistusinghashing;

import java.util.HashSet;
import java.util.Set;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It returns union of two linked lists
	 */
	public Node getUnionOfTwoLinkedList(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return null;
		}

		if (node1 == null || node2 == null) {
			return node1 != null ? node1 : node2;
		}

		Set<Integer> s = new HashSet<>();

		Node temp = new Node();
		Node result = temp;

		while (node1 != null) {
			if (!s.contains(node1.data)) {
				temp.next = node1;
				temp = temp.next;
				s.add(node1.data);
			}
			node1 = node1.next;
		}

		while (node2 != null) {
			if (!s.contains(node2.data)) {
				temp.next = node2;
				temp = temp.next;
				s.add(node2.data);
			}
			node2 = node2.next;
		}
		temp.next = null;

		return result.next;
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

		Node head1 = null;

		head1 = a.insert(22, head1);
		head1 = a.insert(3, head1);
		head1 = a.insert(10, head1);
		head1 = a.insert(3, head1);
		head1 = a.insert(13, head1);

		Node head2 = null;

		head2 = a.insert(2, head2);
		head2 = a.insert(13, head2);
		head2 = a.insert(10, head2);
		head2 = a.insert(27, head2);
		head2 = a.insert(36, head2);

		Node unionOfLinkedList = a.getUnionOfTwoLinkedList(head1, head2);
		a.printList(unionOfLinkedList);

	}
}