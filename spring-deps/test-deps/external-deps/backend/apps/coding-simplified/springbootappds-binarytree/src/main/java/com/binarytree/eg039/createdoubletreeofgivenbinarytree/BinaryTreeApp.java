package com.binarytree.eg039.createdoubletreeofgivenbinarytree;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public void doubleTree(Node node) {
		if (node == null) {
			return;
		}

		doubleTree(node.left);
		doubleTree(node.right);

		Node newNode = createNewNode(node.data);
		newNode.left = node.left;
		node.left = newNode;
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

		a.doubleTree(root);
	}

}