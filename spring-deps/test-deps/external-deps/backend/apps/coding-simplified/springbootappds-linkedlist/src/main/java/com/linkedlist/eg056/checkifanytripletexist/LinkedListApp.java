package com.linkedlist.eg056.checkifanytripletexist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It check if there is triplet exists for given sum out of three linked lists
	 */
	public boolean isTripletExistForSum(Node node1, Node node2, Node node3, int val) {

		Node head2, head3;
		head2 = node2;
		head3 = node3;

		while (node1 != null) {
			while (node2 != null && node3 != null) {

				int s = node1.data + node2.data + node3.data;

				if (s == val) {
					return true;
				} else if (s > val) {
					node3 = node3.next;
				} else {
					node2 = node2.next;
				}
			}

			node1 = node1.next;
			node2 = head2;
			node3 = head3;
		}

		return false;
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
		head1 = a.insert(5, head1);
		head1 = a.insert(2, head1);
		head1 = a.insert(9, head1);

		a.printList(head1);
		System.out.println();

		Node head2 = null;
		head2 = a.insert(2, head2);
		head2 = a.insert(3, head2);
		head2 = a.insert(7, head2);

		a.printList(head2);
		System.out.println();

		Node head3 = null;
		head3 = a.insert(12, head3);
		head3 = a.insert(8, head3);
		head3 = a.insert(4, head3);

		a.printList(head3);
		System.out.println();

		System.out.println(a.isTripletExistForSum(head1, head2, head3, 13));
		System.out.println(a.isTripletExistForSum(head1, head2, head3, 14));
	}
}