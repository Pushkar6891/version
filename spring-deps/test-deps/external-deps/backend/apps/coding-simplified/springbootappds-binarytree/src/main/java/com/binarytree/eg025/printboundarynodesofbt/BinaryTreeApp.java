package com.binarytree.eg025.printboundarynodesofbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public void printBoundary(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");

			printBoundaryLeft(node.left);

			printLeaves(node.left);
			printLeaves(node.right);

			printBoundaryRight(node.right);
		}
	}

	public void printBoundaryLeft(Node node) {
		if (node == null) {
			return;
		}

		if (node.left != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.left);
		} else if (node.right != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.right);
		}
	}

	public void printLeaves(Node node) {
		if (node == null) {
			return;
		}

		printLeaves(node.left);

		if (node.left == null && node.right == null) {
			System.out.print(node.data + " ");
		}
		printLeaves(node.right);
	}

	public void printBoundaryRight(Node node) {
		if (node == null) {
			return;
		}

		if (node.right != null) {
			printBoundaryRight(node.right);
			System.out.print(node.data + " ");
		} else if (node.left != null) {
			printBoundaryRight(node.left);
			System.out.print(node.data + " ");
		}
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
		root.right = a.createNewNode(15);
		root.left.left = a.createNewNode(3);
		root.left.right = a.createNewNode(8);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(10);
		root.right.right = a.createNewNode(20);
		root.right.right.right = a.createNewNode(25);

		a.printBoundary(root);
	}

}