package com.binarytree.eg051.findsumofallleftleafnodesinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public int sumOfLeftLeafNodes(Node node, boolean ifLeftLeaf) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null && ifLeftLeaf) {
			return node.data;
		}

		return sumOfLeftLeafNodes(node.left, true) + sumOfLeftLeafNodes(node.right, false);
	}

	int sumOfLeftLeafNode;

	public void sumOfLeftLeafNodesAnother(Node node, boolean ifLeftLeaf) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null && ifLeftLeaf) {
			sumOfLeftLeafNode = sumOfLeftLeafNode + node.data;
		}

		sumOfLeftLeafNodesAnother(node.left, true);
		sumOfLeftLeafNodesAnother(node.right, false);
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
		root.left.left = a.createNewNode(2);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);

		System.out.println(a.sumOfLeftLeafNodes(root, false));

		a.sumOfLeftLeafNodesAnother(root, false);
		System.out.println(a.sumOfLeftLeafNode);

	}
}