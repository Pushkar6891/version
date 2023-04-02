package com.binarysearchtree.eg022.constructbalancedbstfromarray;

import java.util.Arrays;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	public Node constructBalancedBST(int[] arr) {
		Arrays.sort(arr);

		return constructBalancedBSTUtil(arr, 0, arr.length - 1);
	}

	public Node constructBalancedBSTUtil(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;

		Node node = createNewNode(arr[mid]);

		node.left = constructBalancedBSTUtil(arr, start, mid - 1);
		node.right = constructBalancedBSTUtil(arr, mid + 1, end);

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

		int[] arr = { 8, 6, 12, 18, 34, 23, 3 };

		root = a.constructBalancedBST(arr);

		a.inorder(root);
	}

}