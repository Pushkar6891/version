package com.linkedlist.eg063.mergeKsortedlinkedlist;

class Node {
	Node next;
	int data;
}

class Linked {
	/*
	 * It merges the k sorted linked lists
	 */
	public Node mergeKSortedLists(Node[] arr, int last) {
		while (last != 0) {
			int i = 0;
			int j = last;

			while (i < j) {
				arr[i] = mergeTwoSortedLinkedList(arr[i], arr[j]);

				i++;
				j--;

				if (i >= j) {
					last = j;
					break;
				}
			}
		}

		return arr[0];
	}

	/*
	 * It merges two sorted linked list
	 */
	public Node mergeTwoSortedLinkedList(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return null;
		}

		if (node1 == null || node2 == null) {
			return node1 != null ? node1 : node2;
		}

		return mergeTwoList(node1, node2);
	}

	/*
	 * Helper function to merge two sorted linked list
	 */
	public Node mergeTwoList(Node first, Node second) {
		if (first == null && second == null) {
			return null;
		}

		Node tmp = new Node();
		Node finalList = tmp;
		while (first != null && second != null) {
			if (first.data < second.data) {
				tmp.next = first;
				first = first.next;
			} else {
				tmp.next = second;
				second = second.next;
			}

			tmp = tmp.next;
		}

		tmp.next = (first != null) ? first : second;

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

		Node arr[] = new Node[5];

		arr[0] = a.getNewNode(1);
		arr[0].next = a.getNewNode(3);
		arr[0].next.next = a.getNewNode(5);
		arr[0].next.next.next = a.getNewNode(7);

		arr[1] = a.getNewNode(2);
		arr[1].next = a.getNewNode(4);
		arr[1].next.next = a.getNewNode(6);
		arr[1].next.next.next = a.getNewNode(8);

		arr[2] = a.getNewNode(0);
		arr[2].next = a.getNewNode(9);
		arr[2].next.next = a.getNewNode(10);
		arr[2].next.next.next = a.getNewNode(11);

		arr[3] = a.getNewNode(12);
		arr[3].next = a.getNewNode(14);
		arr[3].next.next = a.getNewNode(16);
		arr[3].next.next.next = a.getNewNode(18);

		arr[4] = a.getNewNode(0);
		arr[4].next = a.getNewNode(19);
		arr[4].next.next = a.getNewNode(20);
		arr[4].next.next.next = a.getNewNode(31);

		Node mergedList = a.mergeKSortedLists(arr, arr.length - 1);
		a.printList(mergedList);

	}
}