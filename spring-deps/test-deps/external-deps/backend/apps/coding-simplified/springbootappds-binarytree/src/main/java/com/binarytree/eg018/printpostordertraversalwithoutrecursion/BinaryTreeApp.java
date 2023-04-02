package com.binarytree.eg018.printpostordertraversalwithoutrecursion;

import java.util.Stack;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public void postorderUsingTwoStack(Node node) {
		if (node == null) {
			return;
		}

		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();

		s1.push(node);

		while (s1.size() > 0) {
			Node t = s1.pop();

			if (t.left != null) {
				s1.push(t.left);
			}

			if (t.right != null) {
				s1.push(t.right);
			}

			s2.push(t);
		}

		while (s2.size() > 0) {
			System.out.print(s2.pop().data + " ");
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

		a.postorderUsingTwoStack(root);
	}

}