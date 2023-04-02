package com.linkedlist.eg046.intersectionpointoftwounsortedlinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It returns the intersection point of two linked list
	 */
	public int getIntersectionOfLists(Node node1, Node node2) {
		if (node1 == null || node2 == null) {
			return -1;
		}

		Node head1 = node1, head2 = node2;

		int count1 = 0, count2 = 0;
		while (node1 != null) {
			count1++;
			node1 = node1.next;
		}

		while (node2 != null) {
			count2++;
			node2 = node2.next;
		}

		int v = count1 - count2;
		while (v > 0) {
			head1 = head1.next;
			v--;
		}

		while (v < 0) {
			head2 = head2.next;
			v++;
		}

		while (head1 != null && head2 != null) {
			if (head1.data == head2.data) {
				return head1.data;
			}

			head1 = head1.next;
			head2 = head2.next;
		}

		return -1;
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

		head1 = a.insert(1, head1);
		head1 = a.insert(24, head1);
		head1 = a.insert(34, head1);
		head1 = a.insert(9, head1);
		head1 = a.insert(8, head1);
		head1 = a.insert(37, head1);
		head1 = a.insert(5, head1);

		a.printList(head1);
		System.out.println();

		Node head2 = null;

		head2 = a.insert(12, head2);
		head2 = a.insert(99, head2);
		head2 = a.insert(8, head2);
		head2 = a.insert(37, head2);
		head2 = a.insert(5, head2);

		a.printList(head2);
		System.out.println();

		System.out.println(a.getIntersectionOfLists(head1, head2));

	}
}