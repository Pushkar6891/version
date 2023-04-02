package com.linkedlist.eg027.deleteNnodesafterMnodes;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * When list is null When n & m are greater than 0 When m is 0 (Delete after No
	 * traversing) When n is 0 (Delete 0 element
	 * 
	 * When n is greater than number of element after traversing m nodes
	 */
	public Node deleteNNodesPostMNodes(int n, int m, Node node) {
		if (node == null) {
			return node;
		}

		Node tmp1 = node;
		Node tmp2 = node;
		int i = 0, j = 0;

		while (i++ < m - 1) {
			tmp1 = tmp1.next;
		}

		tmp2 = (m == 0) ? tmp1 : tmp1.next;

		while (j++ < n) {
			if (tmp2 == null) {
				System.out.println("Not enough elements to delete");
				return node;
			}
			tmp2 = tmp2.next;
		}

		if (m == 0) {
			return tmp2;
		} else {
			tmp1.next = tmp2;
		}

		return node;
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
		head = a.insert(8, head);
		head = a.insert(34, head);
		head = a.insert(13, head);
		head = a.insert(37, head);

		a.printList(head);
		System.out.println();

		head = a.deleteNNodesPostMNodes(2, 2, head);

		a.printList(head);
		System.out.println();
	}
}