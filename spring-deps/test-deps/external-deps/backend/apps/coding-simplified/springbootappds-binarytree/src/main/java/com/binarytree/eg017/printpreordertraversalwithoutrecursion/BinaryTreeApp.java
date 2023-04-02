package com.binarytree.eg017.printpreordertraversalwithoutrecursion;

import java.util.Stack;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public void preorderWithoutRecursion(Node node) {
		if (node == null) {
			return;
		}

		Stack<Node> s = new Stack<Node>();

		s.push(node);

		while (s.size() > 0) {
			Node t = s.pop();
			System.out.print(t.data + " ");

			if (t.right != null) {
				s.push(t.right);
			}

			if (t.left != null) {
				s.push(t.left);
			}
		}
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

		a.preorderWithoutRecursion(root);
	}

}