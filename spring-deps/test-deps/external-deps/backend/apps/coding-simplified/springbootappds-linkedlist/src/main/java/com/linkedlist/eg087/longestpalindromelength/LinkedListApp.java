package com.linkedlist.eg087.longestpalindromelength;

class Node {
	Node next;
	char data;
}

class Linked {
	/*
	 * It returns length of longest Palindrome formed in linked lists
	 */
	public int lengthOfLongestPalindrome(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.next == null) {
			return 1;
		}

		Node next, prev;
		prev = next = null;
		int result = 1;

		while (node != null) {
			next = node.next;
			node.next = prev;

			result = Math.max(result, 2 * getCommonElementCount(prev, next) + 1);
			result = Math.max(result, 2 * getCommonElementCount(node, next));

			prev = node;
			node = next;
		}

		return result;
	}

	public int getCommonElementCount(Node a, Node b) {
		int count = 0;

		while (a != null && b != null) {
			if (a.data == b.data) {
				count++;
			} else {
				break;
			}

			a = a.next;
			b = b.next;
		}

		return count;
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
		head = a.insert('a', head);
		head = a.insert('v', head);
		head = a.insert('e', head);

		System.out.println(a.lengthOfLongestPalindrome(head));
	}
}