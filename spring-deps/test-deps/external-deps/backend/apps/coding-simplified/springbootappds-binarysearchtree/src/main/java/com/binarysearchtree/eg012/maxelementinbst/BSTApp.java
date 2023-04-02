package com.binarysearchtree.eg012.maxelementinbst;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	public int getMax(Node node) {
		if (node == null) {
			System.out.println("Tree is EMpty");
			return -1;
		}

		while (node.right != null) {
			node = node.right;
		}

		return node.data;
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
		root = a.insert(root, 3);
		root = a.insert(root, 6);
		root = a.insert(root, 10);
		root = a.insert(root, 4);
		root = a.insert(root, 7);
		root = a.insert(root, 1);
		root = a.insert(root, 14);
		root = a.insert(root, 13);

		System.out.println(a.getMax(root));
	}

}