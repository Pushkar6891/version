package com.linkedlist.eg013.getsizeoflinkedlistusingiterativeapproach;

class Node {
	int data;
	Node next;
}

class LinkedList {

	private Node getNewNode(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;

		return newNode;
	}

	public int getSizeOfList(Node node) {
		if (node == null) {
			return 0;
		}

		int count = 0;

		while (node != null) {
			count++;

			node = node.next;
		}

		return count;
	}

	public Node insert(Node node, int val) {
		if (node == null) {
			return getNewNode(val);
		}

		Node firstNode = node;

		while (node.next != null) {
			node = node.next;
		}

		node.next = getNewNode(val);
		return firstNode;
	}

	public void printList(Node node) {
		if (node == null) {
			return;
		}

		while (node != null) {
			System.out.print(node.data + " ");

			node = node.next;
		}
	}
}

public class LinkedListApp {

	public static void main(String[] args) {

		LinkedList obj = new LinkedList();
		Node head = null;

		head = obj.insert(head, 12);
		head = obj.insert(head, 7);
		head = obj.insert(head, 8);
		head = obj.insert(head, 10);
		head = obj.insert(head, 5);

		obj.printList(head);
		System.out.println();

		System.out.println("Size of list: " + obj.getSizeOfList(head));

	}

}