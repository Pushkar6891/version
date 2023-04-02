package com.binarytree.eg036.checkifbtisfoldabletreeornot;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public boolean ifFoldableTree(Node node) {
		if (node == null) {
			return true;
		}

		return ifMirrorStructure(node.left, node.right);
	}

	public boolean ifMirrorStructure(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return true;
		}

		if (node1 == null || node2 == null) {
			return false;
		}

		return ifMirrorStructure(node1.left, node2.right) && ifMirrorStructure(node1.right, node2.left);
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
		root.left.left = a.createNewNode(5);
		root.right = a.createNewNode(8);
		root.right.right = a.createNewNode(5);

		System.out.println(a.ifFoldableTree(root));
	}

}