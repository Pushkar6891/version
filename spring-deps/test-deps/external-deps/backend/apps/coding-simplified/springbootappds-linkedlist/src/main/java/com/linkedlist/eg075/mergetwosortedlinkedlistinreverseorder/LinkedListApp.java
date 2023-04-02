package com.linkedlist.eg075.mergetwosortedlinkedlistinreverseorder;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It merges two Sorted Linked Lists in reverse order
	 */
	public Node mergeTwoSortedLinkedListReverseOrder(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return null;
		}

		Node mergedList, next;
		mergedList = null;

		while (node1 != null && node2 != null) {
			if (node1.data < node2.data) {
				next = node1.next;
				node1.next = mergedList;
				mergedList = node1;
				node1 = next;
			} else {
				next = node2.next;
				node2.next = mergedList;
				mergedList = node2;
				node2 = next;
			}
		}

		Node temp = node1 != null ? node1 : node2;
		while (temp != null) {
			next = temp.next;
			temp.next = mergedList;
			mergedList = temp;
			temp = next;
		}

		return mergedList;
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

		head1 = a.insert(1, head1);
		head1 = a.insert(5, head1);
		head1 = a.insert(9, head1);
		head1 = a.insert(10, head1);

		Node head2 = null;
		head2 = a.insert(7, head2);
		head2 = a.insert(18, head2);

		System.out.println("List 1:");
		a.printList(head1);
		System.out.println("\nList 2:");
		a.printList(head2);

		Node mergedInReverse = a.mergeTwoSortedLinkedListReverseOrder(head1, head2);
		System.out.println("\nMerged List :");
		a.printList(mergedInReverse);
	}
}