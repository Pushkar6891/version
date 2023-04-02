package com.linkedlist.eg085.checkiflinkedlistformsapalindrome;

class Node {
	Node next;
	char data;
}

class Linked {
	/*
	 * It checks if Linked list of String forms a Palindrome
	 */
	public boolean checkIfLinkedListOfStringFormsPalindrome(Node head) {
		if (head == null) {
			return false;
		}

		if (head.next == null) {
			return true;
		}

		Node middle = getMiddleNode(head);
		middle.next = reverse(middle.next);
		Node secondHalf = middle.next;
		Node second = secondHalf;
		middle.next = null;

		boolean ifPalidrome = true;
		while (head != null && second != null) {
			if (head.data != second.data) {
				return false;
			}

			head = head.next;
			second = second.next;
		}

		if (head != null && second == null) {
			ifPalidrome = true;
		}

		middle.next = reverse(secondHalf);

		return ifPalidrome;
	}

	public Node getMiddleNode(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node slow, fast;
		slow = fast = node;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public Node reverse(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node tmp = reverse(node.next);
		node.next.next = node;
		node.next = null;

		return tmp;
	}

	/*
	 * getNewNode() method to generate a new node
	 */
	public Node getNewNode(char key) {
		Node a = new Node();
		a.next = null;
		a.data = key;
		return a;
	}

	/*
	 * insert method is used to insert the element in Linked List
	 */
	public Node insert(char key, Node node) {

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

		Node head = null;

		head = a.insert('e', head);
		head = a.insert('v', head);
		head = a.insert('a', head);
		head = a.insert('v', head);
		head = a.insert('e', head);

		System.out.println(a.checkIfLinkedListOfStringFormsPalindrome(head));
	}
}