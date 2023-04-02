package com.linkedlist.eg037.checkiflinkedlistispalindrome;

import java.util.Stack;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It'll check if linked list is Palindrome
	 */
	public boolean ifPalindrome(Node node) {
		if (node == null || node.next == null) {
			return true;
		}

		Node slow, fast;
		slow = fast = node;

		Stack<Node> s = new Stack<Node>();
		s.push(slow);

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			s.push(slow);
		}

		if (fast.next == null) {
			s.pop();
		}

		Node secondHalf = slow.next;

		while (secondHalf != null) {
			if (s.pop().data != secondHalf.data) {
				return false;
			}

			secondHalf = secondHalf.next;
		}

		return true;
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
		head = a.insert(37, head);
		head = a.insert(99, head);
		head = a.insert(12, head);

		a.printList(head);
		System.out.println();

		System.out.println(a.ifPalindrome(head));
	}
}