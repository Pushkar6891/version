package com.linkedlist.eg086.comparetwostrings;

class Node {
	Node next;
	char data;
}

class Linked {
	/*
	 * It compare two string form of linked lists
	 */
	public int compareString(Node head1, Node head2) {
		if (head1 == null && head2 == null) {
			return 0;
		}

		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				return -1;
			} else if (head1.data > head2.data) {
				return 1;
			}

			head1 = head1.next;
			head2 = head2.next;
		}

		if (head1 == null && head2 == null) {
			return 0;
		}

		return head1 != null ? 1 : -1;
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

		Node head1 = null;

		head1 = a.insert('e', head1);
		head1 = a.insert('v', head1);
		head1 = a.insert('a', head1);

		Node head2 = null;

		head2 = a.insert('e', head2);
		head2 = a.insert('v', head2);
		head2 = a.insert('a', head2);

		System.out.println(a.compareString(head1, head2));
	}
}