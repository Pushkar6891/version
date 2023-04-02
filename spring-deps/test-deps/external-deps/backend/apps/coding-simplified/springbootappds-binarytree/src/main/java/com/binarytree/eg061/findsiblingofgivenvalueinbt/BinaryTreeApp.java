package com.binarytree.eg061.findsiblingofgivenvalueinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public Node getSibling(Node node, int key) {
		if (node == null || node.data == key) {
			return null;
		}

		if (node.left != null && node.left.data == key) {
			return node.right;
		}

		if (node.right != null && node.right.data == key) {
			return node.left;
		}

		Node l = getSibling(node.left, key);

		if (l != null) {
			return l;
		}

		l = getSibling(node.right, key);
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

		Node sibling = a.getSibling(root, 7);
		if (sibling != null) {
			System.out.println(sibling.data);
		} else {
			System.out.println("Sibling is null");
		}
	}
}