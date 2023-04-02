package com.linkedlist.eg034.removeloop;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It'll detect & remove loop in linked list
	 */
	public void detectAndRemoveLoopPresent(Node head) {
		if (head == null) {
			return;
		}

		Node slow, fast;

		slow = fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow.data == fast.data) {
				break;
			}
		}

		if (slow == fast) {
			if (fast == head) {
				while (slow.next != fast) {
					slow = slow.next;
				}

				slow.next = null;
			} else {
				slow = head;
				while (slow.next != fast.next) {
					slow = slow.next;
				}

				fast.next = null;
			}
		}

		return;
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
		head = a.insert(5, head);
		head = a.insert(25, head);

		head.next.next.next.next.next = head.next;

		a.detectAndRemoveLoopPresent(head);

		a.printList(head);

	}
}