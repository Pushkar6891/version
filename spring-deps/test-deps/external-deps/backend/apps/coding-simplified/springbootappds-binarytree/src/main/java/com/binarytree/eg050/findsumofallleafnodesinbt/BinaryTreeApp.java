package com.binarytree.eg050.findsumofallleafnodesinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public int sumOfLeafNodes(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return node.data;
		}

		return sumOfLeafNodes(node.left) + sumOfLeafNodes(node.right);
	}

	int sumOfLeafNode;

	public void sumOfLeafNodesAnother(Node node) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			sumOfLeafNode = sumOfLeafNode + node.data;
		}

		sumOfLeafNodes(node.left);
		sumOfLeafNodes(node.right);
	}

	public Node createNewNode(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
}

public class BinaryTreeApp {

	public static void main(String[] args) {

		BinaryTree a = new BinaryTree();

		Node root = a.createNewNode(2);
		root.left = a.createNewNode(7);
		root.right = a.createNewNode(9);
		root.left.left = a.createNewNode(2);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);

		System.out.println(a.sumOfLeafNodes(root));

	}
}