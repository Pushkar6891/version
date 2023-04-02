package com.binarytree.eg069.findclosestleafnodedistancefromgivenvalueinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public int closestLeafNode(Node node, int val) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		Node arr[] = new Node[10];
		return closestLeafNodeUtil(node, arr, val, 0);
	}

	public int closestLeafNodeUtil(Node node, Node arr[], int val, int level) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		int minDistFromLeaf = Integer.MAX_VALUE;

		if (node.data == val) {
			minDistFromLeaf = getMinDistanceToLeaf(node);

			for (int i = level - 1; i >= 0; i--) {
				minDistFromLeaf = Math.min(minDistFromLeaf, level - i + getMinDistanceToLeaf(arr[i]));
			}

			return minDistFromLeaf;
		}

		arr[level] = node;

		minDistFromLeaf = Math.min(minDistFromLeaf, closestLeafNodeUtil(node.left, arr, val, level + 1));

		if (minDistFromLeaf != Integer.MAX_VALUE) {
			return minDistFromLeaf;
		}

		return Math.min(minDistFromLeaf, closestLeafNodeUtil(node.right, arr, val, level + 1));
	}

	public int getMinDistanceToLeaf(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		if (node.left == null && node.right == null) {
			return 0;
		}

		return 1 + Math.min(getMinDistanceToLeaf(node.left), getMinDistanceToLeaf(node.right));
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
		root.left.left = a.createNewNode(10);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.left.left = a.createNewNode(4);
		root.left.right.left.left.left = a.createNewNode(3);
		root.right = a.createNewNode(9);

		System.out.println(a.closestLeafNode(root, 6));
	}
}