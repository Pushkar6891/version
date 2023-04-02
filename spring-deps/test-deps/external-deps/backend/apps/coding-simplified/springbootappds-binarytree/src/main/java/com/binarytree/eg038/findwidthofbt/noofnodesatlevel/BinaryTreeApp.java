package com.binarytree.eg038.findwidthofbt.noofnodesatlevel;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public int getWidthOfLevel(Node node, int level) {
		if (node == null) {
			return 0;
		}

		if (level == 1) {
			return 1;
		}

		return getWidthOfLevel(node.left, level - 1) + getWidthOfLevel(node.right, level - 1);
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
		root.left.left = a.createNewNode(12);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);
		root.right.right = a.createNewNode(9);
		root.right.right.left = a.createNewNode(4);
		root.right.right.right = a.createNewNode(40);

		System.out.println(a.getWidthOfLevel(root, 3));
	}

}