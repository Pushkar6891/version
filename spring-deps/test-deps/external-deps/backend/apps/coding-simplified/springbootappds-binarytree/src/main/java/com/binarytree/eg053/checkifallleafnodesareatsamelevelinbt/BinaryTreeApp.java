package com.binarytree.eg053.checkifallleafnodesareatsamelevelinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	int levelOfLeaf;

	public boolean ifLeavesAtSameLevel(Node node, int level) {
		if (node == null) {
			return true;
		}

		if (node.left == null && node.right == null) {
			if (levelOfLeaf == 0) {
				levelOfLeaf = level;
				return true;
			}

			return levelOfLeaf == level;
		}

		return ifLeavesAtSameLevel(node.left, level + 1) && ifLeavesAtSameLevel(node.right, level + 1);
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

		System.out.println(a.ifLeavesAtSameLevel(root, 1));
	}
}