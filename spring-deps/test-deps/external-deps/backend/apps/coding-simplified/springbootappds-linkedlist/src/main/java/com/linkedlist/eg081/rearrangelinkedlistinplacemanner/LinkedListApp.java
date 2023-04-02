package com.linkedlist.eg081.rearrangelinkedlistinplacemanner;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It rearrange the Linked list inplace
	 */
	public Node rearrangeLinkedListInPlace(Node head) {
		if (head == null || head.next == null || head.next.next == null) {
			return head;
		}

		Node middleNode = getMiddleNode(head);
		Node nextList = middleNode.next;
		middleNode.next = null;

		Node reversedList = reverse(nextList);
		Node firstList = head;

		Node finalList = new Node();
		Node node = finalList;

		while (firstList != null || reversedList != null) {

			if (firstList != null) {
				node.next = firstList;
				node = node.next;
				firstList = firstList.next;
			}

			if (reversedList != null) {
				node.next = reversedList;
				node = node.next;
				reversedList = reversedList.next;
			}
		}

		return finalList.next;
	}

	public Node getMiddleNode(Node node) {
		Node slow, fast;

		slow = fast = node;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public Node reverse(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node prev, next;
		prev = next = null;

		while (node != null) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}

		return prev;
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

		head = a.insert(1, head);
		head = a.insert(2, head);
		head = a.insert(3, head);
		head = a.insert(4, head);
		head = a.insert(5, head);
		head = a.insert(6, head);

		Node zigZagList = a.rearrangeLinkedListInPlace(head);
		a.printList(zigZagList);

	}
}