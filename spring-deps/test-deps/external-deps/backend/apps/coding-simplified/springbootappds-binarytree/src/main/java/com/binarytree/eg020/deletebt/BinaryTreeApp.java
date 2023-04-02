package com.binarytree.eg020.deletebt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public Node deleteTree(Node node) {
		if (node == null) {
			return null;
		}

		node.left = deleteTree(node.left);
		node.right = deleteTree(node.right);

		System.out.println("Deleting node " + node.data);
		node = null;
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

		Node root = a.createNewNode(8);
		root.left = a.createNewNode(3);
		root.right = a.createNewNode(10);
		root.left.left = a.createNewNode(1);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(4);
		root.left.right.right = a.createNewNode(7);
		root.right.right = a.createNewNode(14);
		root.right.right.left = a.createNewNode(13);

		root = a.deleteTree(root);
	}

}