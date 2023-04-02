package com.binarytree.eg063.checkiftwonodesarecousinstoeachotherinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public boolean ifCousins(Node node, Node a, Node b) {
		if (node == null || a == null || b == null) {
			return false;
		}

		if (getLevelOfNode(node, a.data, 1) != getLevelOfNode(node, b.data, 1)) {
			return false;
		}

		return !isSiblings(node, a, b);
	}

	public int getLevelOfNode(Node node, int val, int level) {
		if (node == null) {
			return 0;
		}

		if (node.data == val) {
			return level;
		}

		int l = getLevelOfNode(node.left, val, level + 1);
		if (l != 0) {
			return l;
		}

		l = getLevelOfNode(node.right, val, level + 1);
		return l;
	}

	public boolean isSiblings(Node node, Node a, Node b) {
		if (node == null) {
			return false;
		}

		return (node.left == a && node.right == b) || (node.left == b && node.right == a) || isSiblings(node.left, a, b)
				|| isSiblings(node.right, a, b);
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
		root.right.right = a.createNewNode(3);
		root.left.left = a.createNewNode(10);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);

		System.out.println(a.ifCousins(root, root.left.left, root.right.right));
	}
}