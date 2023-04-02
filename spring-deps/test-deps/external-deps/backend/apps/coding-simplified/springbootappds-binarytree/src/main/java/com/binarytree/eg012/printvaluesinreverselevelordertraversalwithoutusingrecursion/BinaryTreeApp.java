package com.binarytree.eg012.printvaluesinreverselevelordertraversalwithoutusingrecursion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {
	/*
	 * It'll print all values in Reverse Level order without using recursion in
	 * Binary Tree
	 */
	public void reverseTraversalWithoutRecursion(Node node) {
		if (node == null) {
			return;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.add(node);

		Stack<Node> s = new Stack<Node>();

		while (q.size() > 0) {
			Node t = q.remove();
			s.push(t);

			if (t.right != null) {
				q.add(t.right);
			}

			if (t.left != null) {
				q.add(t.left);
			}
		}

		while (!s.isEmpty()) {
			System.out.print(s.pop().data + " ");
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

		a.reverseTraversalWithoutRecursion(root);
	}

}