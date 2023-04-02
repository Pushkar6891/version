package com.binarytree.eg079.finddiagonalsuminbt;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	Node next;
	int data;
}

class BinaryTree {

	public void diagonalSum(Node node) {
		if (node == null) {
			return;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.add(node);

		while (true) {
			int size = q.size();

			if (size == 0) {
				break;
			}

			int s = 0;

			while (size > 0) {
				Node temp = q.remove();

				while (temp != null) {
					s = s + temp.data;

					if (temp.left != null) {
						q.add(temp.left);
					}

					temp = temp.right;
				}

				size--;
			}

			System.out.println(s);
		}
	}

	public boolean ifLeafNode(Node node) {
		if (node == null) {
			return false;
		}

		if (node.left == null && node.right == null) {
			return true;
		}

		return false;
	}

	public Node createNewNode(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.left = null;
		newNode.next = null;
		newNode.right = null;
		return newNode;
	}
}

public class BinaryTreeApp {

	public static void main(String[] args) {

		BinaryTree a = new BinaryTree();

		Node root = a.createNewNode(2);
		root.left = a.createNewNode(4);
		root.left.left = a.createNewNode(6);
		root.right = a.createNewNode(3);
		root.right.right = a.createNewNode(1);
		root.right.left = a.createNewNode(5);
		root.right.left.left = a.createNewNode(3);
		root.right.left.right = a.createNewNode(2);
		root.right.left.left.left = a.createNewNode(1);

		a.diagonalSum(root);
	}
}