package com.binarytree.eg059.printancestorsofgivenvalueinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public boolean printAncestors(Node node, int val) {
		if (node == null) {
			return false;
		}

		if (node.data == val) {
			System.out.println(node.data);
			return true;
		}

		if (printAncestors(node.left, val) || printAncestors(node.right, val)) {
			System.out.println(node.data);
			return true;
		}

		return false;
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

		a.printAncestors(root, 11);
	}
}