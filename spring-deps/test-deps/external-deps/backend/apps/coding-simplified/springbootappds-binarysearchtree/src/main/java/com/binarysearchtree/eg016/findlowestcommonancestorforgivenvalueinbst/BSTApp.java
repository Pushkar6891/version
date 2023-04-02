package com.binarysearchtree.eg016.findlowestcommonancestorforgivenvalueinbst;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	public Node findLCA(Node node, int n1, int n2) {
		if (node == null) {
			return null;
		}

		while (node != null) {
			if (node.data > n1 && node.data > n2) {
				node = node.left;
			} else if (node.data < n1 && node.data < n2) {
				node = node.right;
			} else {
				break;
			}
		}

		return node;
	}

	public Node insert(Node node, int val) {
		if (node == null) {
			return createNewNode(val);
		}

		if (val < node.data) {
			node.left = insert(node.left, val);
		} else if ((val > node.data)) {
			node.right = insert(node.right, val);
		}

		return node;
	}

	public Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}
}

public class BSTApp {

	public static void main(String[] args) {
		BST a = new BST();
		Node root = null;

		root = a.insert(root, 8);
		root = a.insert(root, 15);
		root = a.insert(root, 6);
		root = a.insert(root, 2);
		root = a.insert(root, 7);
		root = a.insert(root, 13);
		root = a.insert(root, 20);

		Node lca = a.findLCA(root, 2, 15);

		if (lca != null) {
			System.out.println(lca.data);
		}

	}

}