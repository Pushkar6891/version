package com.binarytree.eg031.printelementsbetweenanytwolevels;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public void printBetweenTwoLevels(Node node, int min, int max) {
		if (node == null) {
			return;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		int l = 1;

		while (true) {
			int size = q.size();
			if (size == 0 || l > max) {
				break;
			}
			while (size > 0) {
				Node t = q.remove();
				if (l >= min && l <= max) {
					System.out.print(t.data + " ");
				}
				if (t.left != null) {
					q.add(t.left);
				}

				if (t.right != null) {
					q.add(t.right);
				}

				size--;
			}
			l++;
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
		root.left.left = a.createNewNode(12);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);
		root.right.right = a.createNewNode(9);
		root.right.right.left = a.createNewNode(4);

		a.printBetweenTwoLevels(root, 2, 3);
	}

}