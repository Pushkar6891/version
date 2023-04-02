package com.linkedlist.eg084.alternativelyoddevennodes;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It rearrange linked list in alternate odd-even nodes
	 */
	public Node alternateOddEvenNode(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node odd = new Node();
		Node oddHead = odd;
		Node even = new Node();
		Node evenHead = even;

		Node node = head;

		while (node != null) {
			if (node.data % 2 == 0) {
				even.next = node;
				even = even.next;
			} else {
				odd.next = node;
				odd = odd.next;
			}

			node = node.next;
		}

		odd.next = null;
		even.next = null;

		odd = oddHead.next;
		even = evenHead.next;

		Node curr = new Node();
		Node finalList = curr;

		while (odd != null || even != null) {
			if (odd != null) {
				curr.next = odd;
				curr = curr.next;
				odd = odd.next;
			}

			if (even != null) {
				curr.next = even;
				curr = curr.next;
				even = even.next;
			}
		}

		curr.next = odd != null ? odd : even;

		return finalList.next;
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

		Node head = null;

		head = a.insert(3, head);
		head = a.insert(5, head);
		head = a.insert(32, head);
		head = a.insert(12, head);
		head = a.insert(37, head);

		System.out.println("Original:");
		a.printList(head);
		head = a.alternateOddEvenNode(head);
		System.out.println("\nResult:");
		a.printList(head);
	}
}