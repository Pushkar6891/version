package com.binarytree.eg021.checkiftwobinarytreeareidentical;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public boolean checkIfIdentical(Node t1, Node t2) {
		if (t1 == null && t2 == null) {
			return true;
		}

		if (t1 == null || t2 == null) {
			return false;
		}

		return t1.data == t2.data && checkIfIdentical(t1.left, t2.left) && checkIfIdentical(t1.right, t2.right);
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

		Node root = a.createNewNode(8);
		root.left = a.createNewNode(3);
		root.right = a.createNewNode(10);
		root.left.left = a.createNewNode(1);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(4);
		root.left.right.right = a.createNewNode(7);
		root.right.right = a.createNewNode(14);
		root.right.right.left = a.createNewNode(13);

		Node root1 = a.createNewNode(8);
		root1.left = a.createNewNode(3);
		root1.right = a.createNewNode(10);
		root1.left.left = a.createNewNode(1);
		root1.left.right = a.createNewNode(6);
		root1.left.right.left = a.createNewNode(4);
		root1.left.right.right = a.createNewNode(7);
		root1.right.right = a.createNewNode(14);
		root1.right.right.left = a.createNewNode(13);

		System.out.println(a.checkIfIdentical(root, root1));
	}

}