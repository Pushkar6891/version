package com.linkedlist.eg040.checkiftwolinkedlistareidentical;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It checks if two linked lists are identical
	 */
	public boolean ifIdenticalLists(Node node1, Node node2) {
		while (node1 != null && node2 != null) {
			if (node1.data != node2.data) {
				return false;
			}

			node1 = node1.next;
			node2 = node2.next;
		}

		return (node1 == null && node2 == null);
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

		head1 = a.insert(12, head1);
		head1 = a.insert(99, head1);
		head1 = a.insert(8, head1);
		head1 = a.insert(39, head1);
		head1 = a.insert(5, head1);

		a.printList(head1);
		System.out.println();

		Node head2 = null;

		head2 = a.insert(12, head2);
		head2 = a.insert(99, head2);
		head2 = a.insert(8, head2);
		head2 = a.insert(39, head2);
		head2 = a.insert(5, head2);

		a.printList(head2);
		System.out.println();

		System.out.println(a.ifIdenticalLists(head1, head2));
	}
}