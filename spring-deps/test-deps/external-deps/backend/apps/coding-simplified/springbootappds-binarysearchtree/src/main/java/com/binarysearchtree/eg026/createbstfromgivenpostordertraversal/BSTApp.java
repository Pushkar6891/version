package com.binarysearchtree.eg026.createbstfromgivenpostordertraversal;

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

		Node node = createNewNode(arr[end]);

		int i;
		for (i = end - 1; i >= start; i--) {
			if (arr[i] < node.data) {
				break;
			}
		}

		node.left = createBST(arr, start, i);
		node.right = createBST(arr, i + 1, end - 1);

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

	public void inorder(Node node) {
		if (node == null) {
			return;
		}

		inorder(node.left);

		System.out.print(node.data + " ");

		inorder(node.right);
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

		int[] postOrder = { 2, 5, 9, 8, 4, 12, 20, 15, 10 };

		root = a.createBST(postOrder, 0, postOrder.length - 1);

		a.inorder(root);

	}

}