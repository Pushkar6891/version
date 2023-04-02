package com.linkedlist.eg054.sortlinkedlistofitems0s1s2s;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It sort the linked list, which have all elements as 0, 1 & 2
	 */
	public Node sortListOfZeroOneTwos(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node head = node;

		int count_0, count_1, count_2;

		count_0 = count_1 = count_2 = 0;

		while (node != null) {
			if (node.data == 0) {
				count_0++;
			} else if (node.data == 1) {
				count_1++;
			} else {
				count_2++;
			}

			node = node.next;
		}

		node = head;

		while (count_0 > 0) {
			node.data = 0;
			node = node.next;
			count_0--;
		}

		while (count_1 > 0) {
			node.data = 1;
			node = node.next;
			count_1--;
		}

		while (count_2 > 0) {
			node.data = 2;
			node = node.next;
			count_2--;
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

		head = a.insert(2, head);
		head = a.insert(1, head);
		head = a.insert(0, head);
		head = a.insert(1, head);
		head = a.insert(2, head);
		head = a.insert(1, head);

		head = a.sortListOfZeroOneTwos(head);

		a.printList(head);
	}
}