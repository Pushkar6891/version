package com.binarytree.eg060.findparentofgivenvalueinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public Node getParent(Node node, int key) {
		if (node == null || node.data == key) {
			return null;
		}

		if ((node.left != null && node.left.data == key) || (node.right != null && node.right.data == key)) {
			return node;
		}

		Node l = getParent(node.left, key);

		if (l != null) {
			return l;
		}

		l = getParent(node.right, key);
		return l;
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

		Node parent = a.getParent(root, 6);
		if (parent != null) {
			System.out.println(parent.data);
		} else {
			System.out.println("Parent is null");
		}
	}
}