package com.linkedlist.eg066.countnoofpairstoreachgivensumfromtwolinkedlist;

import java.util.HashSet;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It counts sum of pairs in linked list
	 */
	public int getSumOfPairs(Node node1, Node node2, int sum) {
		if (node1 == null || node2 == null) {
			return 0;
		}

		HashSet<Integer> s = new HashSet<>();
		int countPairs = 0;

		while (node1 != null) {
			s.add(node1.data);
			node1 = node1.next;
		}

		while (node2 != null) {
			if (s.contains(sum - node2.data)) {
				countPairs++;
			}

			node2 = node2.next;
		}

		return countPairs;
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
		Linked a = new Linked();

		Node head1 = null;

		head1 = a.insert(22, head1);
		head1 = a.insert(3, head1);
		head1 = a.insert(10, head1);
		head1 = a.insert(13, head1);
		head1 = a.insert(23, head1);

		Node head2 = null;

		head2 = a.insert(2, head2);
		head2 = a.insert(14, head2);
		head2 = a.insert(10, head2);
		head2 = a.insert(27, head2);
		head2 = a.insert(21, head2);

		System.out.println(a.getSumOfPairs(head1, head2, 24));
	}
}