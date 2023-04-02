package com.linkedlist.eg045.swapnodeswithoutswappingdata;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It swaps the nodes of given values in linked list
	 */
	public Node swapNodes(Node node, int a, int b) {
		if (node == null || node.next == null) {
			return node;
		}

		Node t1, t2, head, prev1, prev2;
		prev1 = prev2 = t1 = t2 = null;

		head = node;

		while (node != null) {
			if (node.data == a) {
				t1 = node;
				break;
			}
			prev1 = node;
			node = node.next;
		}

		node = head;

		while (node != null) {
			if (node.data == b) {
				t2 = node;
				break;
			}
			prev2 = node;
			node = node.next;
		}

		if (t1 == null || t2 == null) {
			return head;
		}

		if (prev1 != null) {
			prev1.next = t2;
		} else {
			head = t2;
		}

		if (prev2 != null) {
			prev2.next = t1;
		} else {
			head = t1;
		}

		Node tmp = t1.next;
		t1.next = t2.next;
		t2.next = tmp;

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
		head = a.insert(37, head);
		head = a.insert(39, head);
		head = a.insert(5, head);

		a.printList(head);
		System.out.println();

		a.swapNodes(head, 39, 99);

		a.printList(head);

	}
}