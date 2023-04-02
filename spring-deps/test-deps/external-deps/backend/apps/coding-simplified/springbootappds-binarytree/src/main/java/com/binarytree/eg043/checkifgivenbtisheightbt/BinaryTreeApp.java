package com.binarytree.eg043.checkifgivenbtisheightbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public int ifHeightBalancedTree(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return 1;
		}

		int lH = ifHeightBalancedTree(node.left);
		int rH = ifHeightBalancedTree(node.right);

		if (lH == -1 || rH == -1 || Math.abs(lH - rH) > 1) {
			return -1;
		}

		return Math.max(lH, rH) + 1;
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
		root.left.left = a.createNewNode(12);
		root.left.left.left = a.createNewNode(1);
		root.left.left.left.right = a.createNewNode(10);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);
		root.left.right.right.right = a.createNewNode(13);

		System.out.println(a.ifHeightBalancedTree(root) != -1);
	}

}