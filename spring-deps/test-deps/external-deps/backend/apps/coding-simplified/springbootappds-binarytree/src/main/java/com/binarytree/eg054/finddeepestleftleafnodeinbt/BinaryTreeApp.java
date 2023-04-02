package com.binarytree.eg054.finddeepestleftleafnodeinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	Node deepestLeftLeafNode;
	int currentLevel;

	public void deepestLeftLeafNode(Node node, int level, boolean ifLeft) {
		if (node == null) {
			return;
		}

		if (ifLeft && node.left == null && node.right == null && level > currentLevel) {
			deepestLeftLeafNode = node;
			currentLevel = level;
		}

		deepestLeftLeafNode(node.left, level + 1, true);
		deepestLeftLeafNode(node.right, level + 1, false);
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

		a.deepestLeftLeafNode(root, 1, false);

		if (a.deepestLeftLeafNode != null) {
			System.out.println(a.deepestLeftLeafNode.data);
		} else {
			System.out.println("Deepest Left Leaf Node is Null");
		}
	}
}