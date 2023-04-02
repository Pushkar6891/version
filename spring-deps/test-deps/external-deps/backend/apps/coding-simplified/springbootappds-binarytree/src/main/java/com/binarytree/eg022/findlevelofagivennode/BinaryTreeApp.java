package com.binarytree.eg022.findlevelofagivennode;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public int getLevelOfNode(Node node, int val, int level) {
		if (node == null) {
			return 0;
		}

		int l;

		if (node.data == val) {
			return level;
		}

		l = getLevelOfNode(node.left, val, level + 1);

		if (l != 0) {
			return l;
		}

		l = getLevelOfNode(node.right, val, level + 1);

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
		root.right = a.createNewNode(5);
		root.left.left = a.createNewNode(2);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);
		root.right.right = a.createNewNode(9);
		root.right.right.left = a.createNewNode(4);

		System.out.println(a.getLevelOfNode(root, 7, 1));
	}

}