package com.binarytree.eg044.checkifpathfromroottoleafmatchinggivensuminbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public boolean ifRootToLeafPathSumMatches(Node node, int total) {
		if (node == null) {
			return false;
		}

		if (node.left == null && node.right == null && total == node.data)
			return true;

		return ifRootToLeafPathSumMatches(node.left, total - node.data)
				|| ifRootToLeafPathSumMatches(node.right, total - node.data);
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

		System.out.println(a.ifRootToLeafPathSumMatches(root, 21));
	}

}