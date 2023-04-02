package com.binarysearchtree.eg018.findKthlargestelementinbst;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	static int countElement = 0;

	public Node getKthLargestElementBST(Node node, int k) {
		if (node == null) {
			return null;
		}

		Node right = getKthLargestElementBST(node.right, k);

		if (right != null) {
			return right;
		}

		countElement++;

		if (countElement == k) {
			return node;
		}

		return getKthLargestElementBST(node.left, k);
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

		Node kthLargest = a.getKthLargestElementBST(root, 2);

		if (kthLargest != null) {
			System.out.println(kthLargest.data);
		} else {
			System.out.println("There're more values than given value");
		}

	}

}