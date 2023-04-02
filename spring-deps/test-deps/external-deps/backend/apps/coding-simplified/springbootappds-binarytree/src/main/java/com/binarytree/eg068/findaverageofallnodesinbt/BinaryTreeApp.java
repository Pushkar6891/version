package com.binarytree.eg068.findaverageofallnodesinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	int sum;
	int count;

	public void getAverage(Node node) {
		if (node == null) {
			return;
		}

		sum = sum + node.data;
		count = count + 1;

		getAverage(node.left);
		getAverage(node.right);
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

		a.getAverage(root);
		System.out.println(a.sum / a.count);
	}
}