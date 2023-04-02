package com.binarytree.eg058.findifsequenceispresentfromroottoleafinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public boolean checkIfSequenceMatchedFromRootToLeaf(Node node, int[] sequence, int index) {
		if (node == null) {
			return false;
		}

		if (index >= sequence.length || node.data != sequence[index]) {
			return false;
		}

		if (node.left == null && node.right == null && index == sequence.length - 1) {
			return true;
		}

		return checkIfSequenceMatchedFromRootToLeaf(node.left, sequence, index + 1)
				|| checkIfSequenceMatchedFromRootToLeaf(node.right, sequence, index + 1);
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
		root.left.left = a.createNewNode(6);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(1);
		root.left.right.left.left = a.createNewNode(4);
		root.left.right.right = a.createNewNode(1);

		int[] sequence = { 2, 7, 6, 1 };

		System.out.println(a.checkIfSequenceMatchedFromRootToLeaf(root, sequence, 0));
	}
}