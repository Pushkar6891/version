package com.binarytree.eg055.finddepthofoddlevelleafnodeinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	int depthDeepestOldLevelNode;

	public void depthDeepestOddLevelNodeSecond(Node node, int level) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null && (level % 2 != 0) && (level > depthDeepestOldLevelNode)) {
			depthDeepestOldLevelNode = level;
		}

		depthDeepestOddLevelNodeSecond(node.left, level + 1);
		depthDeepestOddLevelNodeSecond(node.right, level + 1);
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
		root.left.right.right = a.createNewNode(11);

		a.depthDeepestOddLevelNodeSecond(root, 1);

		System.out.println(a.depthDeepestOldLevelNode);
	}
}