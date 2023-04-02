package com.binarysearchtree.eg021.convertbsttosorteddoublylinkedlist;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	Node headLinkedList;
	Node prev;

	public void bstToDoublyLinkedList(Node node) {
		if (node == null) {
			return;
		}

		bstToDoublyLinkedList(node.left);

		if (prev == null) {
			headLinkedList = node;
		} else {
			node.left = prev;
			prev.right = node;
		}

		prev = node;

		bstToDoublyLinkedList(node.right);
	}

	public void printList() {

		Node node = headLinkedList;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.right;
		}
	}

	public Node insert(Node node, int val) {
		if (node == null) {
			return createNewNode(val);
		}

		if (val < node.data) {
			node.left = insert(node.left, val);
		} else if ((val > node.data)) {
			node.right = insert(node.right, val);
		}

		return node;
	}

	public Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}
}

public class BSTApp {

	public static void main(String[] args) {
		BST a = new BST();
		Node root = null;

		root = a.insert(root, 8);
		root = a.insert(root, 15);
		root = a.insert(root, 6);
		root = a.insert(root, 2);
		root = a.insert(root, 7);
		root = a.insert(root, 20);

		a.bstToDoublyLinkedList(root);
		a.printList();

	}

}