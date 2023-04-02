package com.linkedlist.eg076.movealloccurrencesofanelementtoend;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It moves all occurrence of a element to end of the Linked list
	 */
	public Node moveAllOccurrenceOfElementToEnd(Node head, int value) {
		if (head == null || head.next == null) {
			return head;
		}

		Node node, tail, prev, next, temp;
		node = head;
		prev = null;

		while (node.next != null) {
			node = node.next;
		}

		tail = node;
		temp = tail;
		node = head;

		while (node != temp) {
			if (node.data == value && prev == null) {
				next = node.next;
				tail.next = node;
				tail = tail.next;
				node.next = null;
				node = head = next;
			} else if (node.data == value && prev != null) {
				next = node.next;
				prev.next = node.next;
				tail.next = node;
				tail = tail.next;
				node.next = null;
				node = next;
			} else {
				prev = node;
				node = node.next;
			}
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

		head = a.insert(3, head);
		head = a.insert(2, head);
		head = a.insert(4, head);
		head = a.insert(3, head);
		head = a.insert(5, head);
		head = a.insert(2, head);
		
		System.out.println("Original List:");
		a.printList(head);

		head = a.moveAllOccurrenceOfElementToEnd(head, 2);
		System.out.println("\nFinal List:");
		a.printList(head);
	}
}