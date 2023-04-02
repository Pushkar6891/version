package com.binarytree.eg041.findheightoftreeiniterativemanner;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public int heightIteratively(Node node) {
		if (node == null) {
			return -1;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		int height = 0;

		while (true) {
			int size = q.size();
			if (size == 0) {
				break;
			}

			while (size > 0) {
				Node t = q.remove();
				if (t.left != null) {
					q.add(t.left);
				}

				if (t.right != null) {
					q.add(t.right);
				}

				size--;
			}

			height = height + 1;
		}
		return height;
	}

	public int height(Node node) {
		if (node == null) {
			return -1;
		}

		return Math.max(height(node.left), height(node.right)) + 1;
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

		System.out.println(a.heightIteratively(root));
	}

}