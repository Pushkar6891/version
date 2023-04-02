package com.binarytree.eg048.findmaxormininbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	int maximum = Integer.MIN_VALUE;
	int minimum = Integer.MAX_VALUE;

	public void findMinMaxValue(Node node) {
		if (node == null) {
			return;
		}

		if (node.data > maximum) {
			maximum = node.data;
		}

		if (node.data < minimum) {
			minimum = node.data;
		}

		findMinMaxValue(node.left);
		findMinMaxValue(node.right);
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
		root.left.right.right = a.createNewNode(1);
		root.right.right = a.createNewNode(9);
		root.right.right.left = a.createNewNode(4);

		a.findMinMaxValue(root);
		System.out.println(a.maximum);
		System.out.println(a.minimum);
	}
}