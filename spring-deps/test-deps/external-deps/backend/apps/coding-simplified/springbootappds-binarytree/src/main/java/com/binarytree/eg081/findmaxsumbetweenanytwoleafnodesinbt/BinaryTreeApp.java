package com.binarytree.eg081.findmaxsumbetweenanytwoleafnodesinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	int maxSumBetweenTwoLeaves = 0;

	public int getMaxSumPathBetweenTwoLeaves(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return node.data;
		}

		int l = getMaxSumPathBetweenTwoLeaves(node.left);
		int r = getMaxSumPathBetweenTwoLeaves(node.right);

		if (node.left != null && node.right != null) {
			if (l + r + node.data > maxSumBetweenTwoLeaves) {
				maxSumBetweenTwoLeaves = l + r + node.data;
			}

			return Math.max(l, r) + node.data;
		}

		return node.left != null ? l + node.data : r + node.data;
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
		root.left = a.createNewNode(4);
		root.left.left = a.createNewNode(1);
		root.left.right = a.createNewNode(6);
		root.right = a.createNewNode(5);
		root.right.right = a.createNewNode(7);

		a.getMaxSumPathBetweenTwoLeaves(root);
		System.out.println(a.maxSumBetweenTwoLeaves);

	}
}