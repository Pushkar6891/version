package com.binarytree.eg073.convertnextpointertoitsinordersuccessorinbt;

class Node {
	Node left;
	Node right;
	Node next;
	int data;
}

class BinaryTree {

	Node prev;

	public void connectNextPointerToInorderSuccessor(Node node) {
		if (node == null) {
			return;
		}

		connectNextPointerToInorderSuccessor(node.left);

		if (prev != null) {
			prev.next = node;
		}

		prev = node;

		connectNextPointerToInorderSuccessor(node.right);
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

		Node root = a.createNewNode(12);
		root.left = a.createNewNode(7);
		root.left.left = a.createNewNode(6);
		root.left.right = a.createNewNode(9);
		root.right = a.createNewNode(24);

		a.connectNextPointerToInorderSuccessor(root);

	}
}