package com.binarysearchtree.eg025.removebstnodeswhichareoutsiderange;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	public Node removeBSTKeysOutsideGivenRange(Node node, int min, int max) {
		if (node == null) {
			return null;
		}

		node.left = removeBSTKeysOutsideGivenRange(node.left, min, max);
		node.right = removeBSTKeysOutsideGivenRange(node.right, min, max);

		if (node.data < min) {
			return node.right;
		} else if (node.data > max) {
			return node.left;
		}

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

		root = a.insert(root, 8);
		root = a.insert(root, 15);
		root = a.insert(root, 6);
		root = a.insert(root, 2);
		root = a.insert(root, 7);
		root = a.insert(root, 20);
		root = a.insert(root, 5);
		root = a.insert(root, 12);
		root = a.insert(root, 3);

		root = a.removeBSTKeysOutsideGivenRange(root, 4, 12);

	}

}