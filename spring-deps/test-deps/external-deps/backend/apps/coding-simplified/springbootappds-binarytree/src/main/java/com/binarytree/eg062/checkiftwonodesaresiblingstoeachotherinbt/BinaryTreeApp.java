package com.binarytree.eg062.checkiftwonodesaresiblingstoeachotherinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

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

		System.out.println(a.isSiblings(root, root.left.right.left, root.left.right.right));
	}
}