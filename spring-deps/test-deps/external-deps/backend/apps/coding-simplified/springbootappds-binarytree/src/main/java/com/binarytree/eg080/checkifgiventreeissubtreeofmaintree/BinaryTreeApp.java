package com.binarytree.eg080.checkifgiventreeissubtreeofmaintree;

class Node {
	Node left;
	Node right;
	Node next;
	int data;
}

class BinaryTree {

	public boolean isSubTree(Node main, Node sub) {
		if (sub == null) {
			return true;
		}

		if (main == null) {
			return false;
		}

		if (ifIdenticalTrees(main, sub)) {
			return true;
		}

		return isSubTree(main.left, sub) || isSubTree(main.right, sub);
	}

	public boolean ifIdenticalTrees(Node a, Node b) {
		if (a == null && b == null) {
			return true;
		}

		if (a == null || b == null) {
			return false;
		}

		return a.data == b.data && ifIdenticalTrees(a.left, b.left) && ifIdenticalTrees(a.right, b.right);
	}

	public boolean isSubTreeOptimized(Node main, int mainTreeNodes, Node sub, int subTreeNodes) {
		if (sub == null) {
			return true;
		}

		if (main == null) {
			return false;
		}

		int mainInorder[] = new int[mainTreeNodes];
		inorderFillArray(main, mainInorder);
		i = 0;

		int subInorder[] = new int[subTreeNodes];
		inorderFillArray(sub, subInorder);
		i = 0;

		String mainInorderString = arrayToString(mainInorder);
		String subInorderString = arrayToString(subInorder);

		if (!mainInorderString.contains(subInorderString)) {
			return false;
		}

		int mainPreorder[] = new int[mainTreeNodes];
		preorderFillArray(main, mainPreorder);
		i = 0;

		int subPreorder[] = new int[subTreeNodes];
		preorderFillArray(sub, subPreorder);

		String mainPreorderString = arrayToString(mainPreorder);
		String subPreorderString = arrayToString(subPreorder);

		return mainPreorderString.contains(subPreorderString);
	}

	int i;

	public void inorderFillArray(Node node, int a[]) {
		if (node == null) {
			return;
		}

		inorderFillArray(node.left, a);

		a[i++] = node.data;

		inorderFillArray(node.right, a);
	}

	public void preorderFillArray(Node node, int a[]) {
		if (node == null) {
			return;
		}

		a[i++] = node.data;

		preorderFillArray(node.left, a);
		preorderFillArray(node.right, a);
	}

	public String arrayToString(int a[]) {
		String s = "";
		for (int i = 0; i < a.length; i++) {
			s = s + a[i];
		}

		return s;
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
		root.left.left = a.createNewNode(1);
		root.left.right = a.createNewNode(6);
		root.right = a.createNewNode(5);
		root.right.right = a.createNewNode(7);

		Node root2 = a.createNewNode(4);
		root2.left = a.createNewNode(1);
		root2.right = a.createNewNode(6);

		System.out.println(a.isSubTree(root, root2));
		System.out.println(a.isSubTreeOptimized(root, 6, root2, 3));
	}
}