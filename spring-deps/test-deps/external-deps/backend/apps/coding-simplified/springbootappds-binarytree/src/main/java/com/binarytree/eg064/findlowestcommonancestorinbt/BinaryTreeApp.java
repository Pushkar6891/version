package com.binarytree.eg064.findlowestcommonancestorinbt;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	boolean ifN1Present = false;
	boolean ifN2Present = false;

	public Node findLowestCommonAncestor(Node node, int n1, int n2) {

		Node lca = this.findLowestCommonAncestorUtil(node, n1, n2);

		if (ifN1Present && ifN2Present) {
			return lca;
		} else if (!ifN1Present && !ifN2Present) {
			return null;
		} else {
			int val = lca.data == n1 ? n2 : n1;
			if (ifElementPresent(lca, val)) {
				return lca;
			}
		}

		return null;
	}

	public Node findLowestCommonAncestorUtil(Node node, int n1, int n2) {
		if (node == null) {
			return null;
		}

		if (node.data == n1) {
			ifN1Present = true;
			return node;
		}

		if (node.data == n2) {
			ifN2Present = true;
			return node;
		}

		Node leftLCA = findLowestCommonAncestorUtil(node.left, n1, n2);
		Node rightLCA = findLowestCommonAncestorUtil(node.right, n1, n2);

		if (leftLCA != null && rightLCA != null) {
			return node;
		}

		return leftLCA != null ? leftLCA : rightLCA;
	}

	private boolean ifElementPresent(Node node, int val) {
		if (node == null) {
			return false;
		}

		if (node.data == val) {
			return true;
		}

		return ifElementPresent(node.left, val) || ifElementPresent(node.right, val);
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

		Node lca = a.findLowestCommonAncestor(root, 2, 10);
		if (lca != null) {
			System.out.println(lca.data);
		} else {
			System.out.println("LCA is null");
		}
	}
}