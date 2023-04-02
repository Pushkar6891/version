package com.linkedlist.eg059.subtracttwonumbersrepresentedaslinkedlistusingreverse;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It adds two linked list numbers which're presented as single digit element
	 */
	public Node substactTwoNumbers(Node node1, Node node2) {
		Node head1 = node1;
		Node head2 = node2;

		int count1 = 0, count2 = 0;

		while (node1 != null) {
			node1 = node1.next;
			count1++;
		}

		while (node2 != null) {
			node2 = node2.next;
			count2++;
		}

		node1 = head1;
		node2 = head2;

		if ((count1 < count2) || (count1 == count2 && node2 == getBiggerList(node1, node2))) {
			Node t = node1;
			node1 = node2;
			node2 = t;
		}

		node1 = this.reverse(node1);
		node2 = this.reverse(node2);

		Node newListHead = null;
		Node prev = null;
		int diff;
		boolean borrow = false;

		while (node1 != null || node2 != null) {
			if (borrow) {
				node1.data = node1.data - 1;
				borrow = false;
			}

			if (node1 != null && node2 != null && node1.data < node2.data) {
				node1.data = node1.data + 10;
				borrow = true;
			}

			diff = (node1 != null ? node1.data : 0) - (node2 != null ? node2.data : 0);

			Node node = getNewNode(diff);
			if (newListHead == null) {
				newListHead = node;
			} else {
				prev.next = node;
			}

			prev = node;

			if (node1 != null) {
				node1 = node1.next;
			}

			if (node2 != null) {
				node2 = node2.next;
			}
		}

		newListHead = this.reverse(newListHead);

		return newListHead;
	}

	/*
	 * It gives the bigger node list
	 */
	public Node getBiggerList(Node node1, Node node2) {
		Node head1 = node1;
		Node head2 = node2;
		while (node1 != null) {
			if (node1.data > node2.data) {
				return head1;
			} else if (node1.data < node2.data) {
				return head2;
			}

			node1 = node1.next;
			node2 = node2.next;
		}

		return head1;
	}

	public Node reverse(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node temp = reverse(node.next);
		node.next.next = node;
		node.next = null;

		return temp;
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

		Node substract = a.substactTwoNumbers(head1, head2);
		a.printList(substract);

	}
}