package com.linkedlist.eg031.getKthnodefromendoflinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * Return kth last node of linked list
	 */
	public int returnKthLastNode(Node node, int k) {
		if (node == null) {
			System.out.println("Linked list is empty");
			return -1;
		}

		Node ptr1, ptr2;
		ptr1 = ptr2 = node;
		for (int i = 1; i < k; i++) {
			ptr2 = ptr2.next;
			if (ptr2 == null) {
				System.out.println("k is greater than total node present in list");
				return -1;
			}
		}

		while (ptr2.next != null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		return ptr1.data;
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
		head = a.insert(20, head);
		head = a.insert(8, head);
		head = a.insert(18, head);

		a.printList(head);
		System.out.println();

		System.out.println("Kth Node: " + a.returnKthLastNode(head, 2));
	}
}