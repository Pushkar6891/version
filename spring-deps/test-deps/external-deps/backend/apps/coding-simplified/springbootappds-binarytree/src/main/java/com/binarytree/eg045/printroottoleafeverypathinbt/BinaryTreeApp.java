package com.binarytree.eg045.printroottoleafeverypathinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public void printRootToLeaf(Node node) {
		if (node == null) {
			return;
		}

		int arr[] = new int[10];
		printRootToLeafImpl(node, arr, 0);
	}

	private void printRootToLeafImpl(Node node, int[] arr, int index) {
		if (node == null) {
			return;
		}

		arr[index] = node.data;

		if (node.left == null && node.right == null) {
			printArray(arr, index);
		}

		printRootToLeafImpl(node.left, arr, index + 1);
		printRootToLeafImpl(node.right, arr, index + 1);
	}

	private void printArray(int[] arr, int index) {
		for (int i = 0; i <= index; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
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

		a.printRootToLeaf(root);
	}
}