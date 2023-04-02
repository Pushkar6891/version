package com.binarytree.eg056.removeallnodeswhichliesonpathwithlessthanKlengthfromroottoleaf;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public Node removeNodesLessThanKLength(Node node, int k, int level) {
		if (node == null) {
			return null;
		}

		node.left = removeNodesLessThanKLength(node.left, k, level + 1);
		node.right = removeNodesLessThanKLength(node.right, k, level + 1);

		if (node.left == null && node.right == null && level < k) {
			return null;
		}

		return node;
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
		root.left.right.right = a.createNewNode(11);

		root = a.removeNodesLessThanKLength(root, 3, 1);
	}
}