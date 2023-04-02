package com.linkedlist.eg082.rearrangelinkedlistaroundgivenvaluekeepingoriginalorder;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It rearrange the Linked list inplace
	 */
	public Node rearrangeLinkedListAroundGivelValueKeepOrder(Node head, int val) {
		if (head == null || head.next == null) {
			return head;
		}

		Node lessValueStartNode, lessValueEndNode, givenValueStartNode, givenValueEndNode, greaterValuesStartNode,
				greaterValuesEndNode;

		lessValueEndNode = lessValueStartNode = null;
		givenValueStartNode = givenValueEndNode = null;
		greaterValuesStartNode = greaterValuesEndNode = null;

		Node node = head;

		while (node != null) {
			if (node.data < val) {
				if (lessValueStartNode == null) {
					lessValueStartNode = lessValueEndNode = node;
				} else {
					lessValueEndNode.next = node;
					lessValueEndNode = node;
				}
			} else if (node.data == val) {
				if (givenValueStartNode == null) {
					givenValueStartNode = givenValueEndNode = node;
				} else {
					givenValueEndNode.next = node;
					givenValueEndNode = node;
				}
			} else {
				if (greaterValuesStartNode == null) {
					greaterValuesStartNode = greaterValuesEndNode = node;
				} else {
					greaterValuesEndNode.next = node;
					greaterValuesEndNode = node;
				}
			}
			node = node.next;
		}

		lessValueEndNode.next = givenValueStartNode;
		givenValueEndNode.next = greaterValuesStartNode;

		greaterValuesEndNode.next = null;

		return lessValueStartNode;
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

		head = a.insert(22, head);
		head = a.insert(3, head);
		head = a.insert(1, head);
		head = a.insert(2, head);
		head = a.insert(5, head);
		head = a.insert(3, head);

		head = a.rearrangeLinkedListAroundGivelValueKeepOrder(head, 3);
		a.printList(head);
	}
}