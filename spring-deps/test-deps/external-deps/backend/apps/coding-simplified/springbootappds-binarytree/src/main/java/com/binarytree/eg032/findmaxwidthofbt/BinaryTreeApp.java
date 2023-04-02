package com.binarytree.eg032.findmaxwidthofbt;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public int getMaximumWidth(Node node) {
		if (node == null) {
			return 0;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.add(node);

		int maxWidth = 1;

		while (true) {
			int size = q.size();
			if (size == 0) {
				break;
			}

			if (size > maxWidth) {
				maxWidth = size;
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
		}

		return maxWidth;
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

		System.out.println(a.getMaximumWidth(root));
	}

}