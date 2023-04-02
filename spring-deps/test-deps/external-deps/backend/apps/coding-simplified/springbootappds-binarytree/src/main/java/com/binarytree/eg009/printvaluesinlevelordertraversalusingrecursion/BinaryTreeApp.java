package com.binarytree.eg009.printvaluesinlevelordertraversalusingrecursion;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {
	/*
	 * It'll print all values in level order using recursion Binary Tree
	 */
	public void levelOrderTraversalUsingRecursion(Node node) {
		if (node == null) {
			return;
		}

		int height = getHeightOfTree(node);

		for (int i = 0; i <= height; i++) {
			printAtGivenLevel(node, i + 1);
			System.out.println();
		}
	}

	public int getHeightOfTree(Node node) {
		if (node == null) {
			return -1;
		}

		return Math.max(getHeightOfTree(node.left), getHeightOfTree(node.right)) + 1;
	}

	public void printAtGivenLevel(Node node, int level) {
		if (node == null) {
			return;
		}

		if (level == 1) {
			System.out.print(node.data + " ");
			return;
		}

		printAtGivenLevel(node.left, level - 1);
		printAtGivenLevel(node.right, level - 1);
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
		root.left.left = a.createNewNode(2);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);
		root.right.right = a.createNewNode(9);
		root.right.right.left = a.createNewNode(4);

		a.levelOrderTraversalUsingRecursion(root);
	}

}