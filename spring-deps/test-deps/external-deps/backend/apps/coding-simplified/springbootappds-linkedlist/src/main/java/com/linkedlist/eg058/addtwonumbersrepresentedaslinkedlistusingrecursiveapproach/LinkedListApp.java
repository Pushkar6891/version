package com.linkedlist.eg058.addtwonumbersrepresentedaslinkedlistusingrecursiveapproach;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It adds two linked list numbers which're presented as single digit element
	 */
	Node result, tempNode;
	int carry;

	public void addSumOfTwoLists(Node node1, Node node2) {

		int count1 = 0, count2 = 0;
		Node head1 = node1, head2 = node2;

		while (node1 != null) {
			count1++;
			node1 = node1.next;
		}

		while (node2 != null) {
			count2++;
			node2 = node2.next;
		}

		if (count1 == count2) {
			calSum(head1, head2);
		} else {
			if (count1 < count2) {
				Node tmp = head1;
				head1 = head2;
				head2 = tmp;
			}

			int d = Math.abs(count2 - count1);

			node1 = head1;
			node2 = head2;

			while (d > 0) {
				node1 = node1.next;
				tempNode = node1;
				d--;
			}

			this.calSum(node1, node2);

			this.addRestSum(head1);
		}

		if (carry > 0) {
			Node a = getNewNode(carry);
			a.next = result;
			result = a;
		}
	}

	public void calSum(Node node1, Node node2) {
		if (node1 == null) {
			return;
		}

		calSum(node1.next, node2.next);
		int s = node1.data + node2.data + carry;

		carry = s / 10;
		if (result == null) {
			result = getNewNode(s % 10);
		} else {
			Node a = getNewNode(s % 10);
			a.next = result;
			result = a;
		}

	}

	public void addRestSum(Node node) {
		if (node == null) {
			return;
		}

		if (node != tempNode) {
			addRestSum(node.next);
			int s = node.data + carry;
			carry = s / 10;
			Node a = getNewNode(s % 10);
			a.next = result;
			result = a;
		}
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
		head1 = a.insert(7, head1);
		head1 = a.insert(8, head1);
		head1 = a.insert(2, head1);
		head1 = a.insert(5, head1);

		a.printList(head1);
		System.out.println();

		Node head2 = null;
		head2 = a.insert(5, head2);
		head2 = a.insert(6, head2);
		head2 = a.insert(7, head2);

		a.printList(head2);
		System.out.println();

		a.addSumOfTwoLists(head1, head2);
		a.printList(a.result);

	}
}