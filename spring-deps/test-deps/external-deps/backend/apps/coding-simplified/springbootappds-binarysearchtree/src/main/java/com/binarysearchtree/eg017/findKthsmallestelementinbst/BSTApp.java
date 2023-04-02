package com.binarysearchtree.eg017.findKthsmallestelementinbst;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	int countElement = 0;

	public Node getKthSmallestElementBST(Node node, int k) {
		if (node == null) {
			return null;
		}

		Node left = getKthSmallestElementBST(node.left, k);

		if (left != null) {
			return left;
		}

		countElement++;
		if (countElement == k) {
			return node;
		}

		return getKthSmallestElementBST(node.right, k);
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

		Node kthSmallest = a.getKthSmallestElementBST(root, 3);

		if (kthSmallest != null) {
			System.out.println(kthSmallest.data);
		} else {
			System.out.println("There're more values than given value");
		}

	}

}