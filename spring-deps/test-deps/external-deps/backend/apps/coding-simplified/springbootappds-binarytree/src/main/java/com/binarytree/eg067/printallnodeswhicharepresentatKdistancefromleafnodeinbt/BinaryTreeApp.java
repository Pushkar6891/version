package com.binarytree.eg067.printallnodeswhicharepresentatKdistancefromleafnodeinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public void printAllElementsAtKDistanceFromLeafNode(Node node, int k) {
		if (node == null || k < 0) {
			return;
		}

		int arr[] = new int[20];
		boolean visited[] = new boolean[20];

		printAllElementsAtKDistanceFromLeafNodeUtil(node, k, arr, visited, 0);
	}

	public void printAllElementsAtKDistanceFromLeafNodeUtil(Node node, int k, int[] arr, boolean[] visited, int count) {
		if (node == null) {
			return;
		}

		arr[count] = node.data;
		visited[count] = false;

		if (node.left == null && node.right == null && count - k >= 0 && visited[count - k] == false) {
			System.out.print(arr[count - k] + " ");
			visited[count - k] = true;
			return;
		}

		printAllElementsAtKDistanceFromLeafNodeUtil(node.left, k, arr, visited, count + 1);
		printAllElementsAtKDistanceFromLeafNodeUtil(node.right, k, arr, visited, count + 1);
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
		root.right.right = a.createNewNode(3);
		root.left.left = a.createNewNode(10);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);

		a.printAllElementsAtKDistanceFromLeafNode(root, 4);
	}
}