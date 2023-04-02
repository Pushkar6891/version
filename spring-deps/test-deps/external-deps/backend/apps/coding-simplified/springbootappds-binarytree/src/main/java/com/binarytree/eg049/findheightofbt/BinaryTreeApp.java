package com.binarytree.eg049.findheightofbt;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public int findMinHeightLevelwise(Node node) {
		if (node == null) {
			return 0;
		}

		int height = 1;

		Queue<Node> queue = new LinkedList<>();
		queue.add(node);

		while (true) {
			int size = queue.size();

			if (queue.isEmpty() || size == 0) {
				break;
			}

			while (size > 0) {
				Node temp = queue.remove();

				if (temp.left == null && temp.right == null) {
					return height;
				}

				if (temp.left != null) {
					queue.add(temp.left);
				}

				if (temp.right != null) {
					queue.add(temp.right);
				}

				size--;
			}

			height++;
		}

		return height;
	}

	public int minHeight(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return 1;
		}

		if (node.left == null) {
			return minHeight(node.right) + 1;
		}

		if (node.right == null) {
			return minHeight(node.left) + 1;
		}

		return Math.min(minHeight(node.left), minHeight(node.right)) + 1;
	}

	int minHeight = Integer.MAX_VALUE;

	public void findMinHeightRecursive(Node node, int height) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null && height < minHeight) {
			minHeight = height;
		}

		findMinHeightRecursive(node.left, height + 1);
		findMinHeightRecursive(node.right, height + 1);
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
		root.right = a.createNewNode(9);
		root.left.left = a.createNewNode(2);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);

		System.out.println(a.findMinHeightLevelwise(root));

		a.findMinHeightRecursive(root, 1);
		System.out.println(a.minHeight);

		System.out.println(a.minHeight(root));

	}
}