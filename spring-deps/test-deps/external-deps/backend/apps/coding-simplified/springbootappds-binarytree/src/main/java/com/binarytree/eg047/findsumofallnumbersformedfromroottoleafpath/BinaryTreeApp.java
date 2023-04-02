package com.binarytree.eg047.findsumofallnumbersformedfromroottoleafpath;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	int sumRootToLeaf;

	public void sumRootToLeaf(Node node, int i) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			sumRootToLeaf = sumRootToLeaf + (i * 10 + node.data);
			return;
		}

		sumRootToLeaf(node.left, i * 10 + node.data);
		sumRootToLeaf(node.right, i * 10 + node.data);
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
		root.right = a.createNewNode(5);
		root.left.left = a.createNewNode(2);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(1);
		root.right.right = a.createNewNode(9);
		root.right.right.left = a.createNewNode(4);

		a.sumRootToLeaf(root, 0);
		System.out.println(a.sumRootToLeaf);
	}
}