package com.binarytree.eg074.findrightnodeofgivenvalueinbt;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	Node next;
	int data;
}

class BinaryTree {

	public void getRightNodeRecursive(Node node, int key) {
		if (node == null || node.data == key) {
			return;
		}

		int levelOfKey = getLevelOfNode(node, key, 1);
		storeRightNode(node, key, levelOfKey);
	}

	public int getLevelOfNode(Node node, int val, int level) {
		if (node == null) {
			return 0;
		}

		if (node.data == val) {
			return level;
		}

		int l = getLevelOfNode(node.left, val, level + 1);
		if (l != 0) {
			return l;
		}

		l = getLevelOfNode(node.right, val, level + 1);
		return l;
	}

	Node rightNode;
	boolean flag;

	public void storeRightNode(Node node, int key, int level) {
		if (node == null) {
			return;
		}

		if (level == 1 & node.data == key) {
			if (flag) {
				rightNode = node;
				return;
			} else {
				flag = true;
			}
		}

		storeRightNode(node.left, key, level - 1);
		storeRightNode(node.right, key, level - 1);
	}

	public Node getRightNodeIterative(Node node, int key) {
		if (node == null || node.data == key) {
			return null;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.add(node);

		boolean flag = false;

		while (true) {
			int size = q.size();

			if (size == 0 || flag) {
				break;
			}

			while (size > 0) {
				Node t = q.remove();
				if (flag) {
					return t;
				}

				if (t.data == key) {
					flag = true;
				}

				if (t.left != null) {
					q.add(t.left);
				}

				if (t.right != null) {
					q.add(t.right);
				}

				size--;
			}
		}

		return null;
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

		a.getRightNodeRecursive(root, 5);
		System.out.println(a.rightNode);

		Node rightNode = a.getRightNodeIterative(root, 5);
		if (rightNode != null) {
			System.out.println(rightNode.data);
		}

	}
}