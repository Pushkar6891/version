package com.linkedlist.eg077.rearrangelinkedlistinzigzag;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It rearrange the Linked list in Zigzag manner
	 */
	public Node rearrangeLinkedListZigzag(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node node = head;
		boolean flag = true;

		while (node.next != null) {
			if (flag) {
				if (node.data > node.next.data) {
					int t = node.data;
					node.data = node.next.data;
					node.next.data = t;
				}
				flag = !flag;
			} else {
				if (node.data < node.next.data) {
					int t = node.data;
					node.data = node.next.data;
					node.next.data = t;
				}
				flag = !flag;
			}

			node = node.next;
		}

		return head;
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

		head = a.insert(2, head);
		head = a.insert(3, head);
		head = a.insert(5, head);
		head = a.insert(9, head);
		head = a.insert(11, head);
		head = a.insert(12, head);
		
		a.printList(head);
		
		System.out.println();

		Node zigZagList = a.rearrangeLinkedListZigzag(head);
		a.printList(zigZagList);

	}
}