package com.binarysearchtree.eg027.createbstfromgivenpreordertraversal;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	public Node createBST(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}

		Node node = createNewNode(arr[start]);

		int i;
		for (i = start + 1; i <= end; i++) {
			if (arr[i] > node.data) {
				break;
			}
		}

		node.left = createBST(arr, start + 1, i - 1);
		node.right = createBST(arr, i, end);

		return node;
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

		int[] preOrder = { 10, 4, 2, 8, 5, 9, 15, 12, 20 };

		root = a.createBST(preOrder, 0, preOrder.length - 1);

	}

}