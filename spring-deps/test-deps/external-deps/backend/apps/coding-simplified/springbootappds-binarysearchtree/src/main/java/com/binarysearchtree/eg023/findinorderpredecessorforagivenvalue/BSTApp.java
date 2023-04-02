package com.binarysearchtree.eg023.findinorderpredecessorforagivenvalue;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	public Node getInorderPredecessor(Node node, int val) {
		if (node == null) {
			return null;
		}

		Node inorderPredecessor = null;

		while (node != null) {
			if (val < node.data) {
				node = node.left;
			} else if (val > node.data) {
				inorderPredecessor = node;
				node = node.right;
			} else {
				if (node.left != null) {
					inorderPredecessor = getPredecessor(node);
				}
				break;
			}
		}
		return node != null ? inorderPredecessor : null;
	}

	public Node getPredecessor(Node node) {
		if (node == null) {
			return null;
		}

		Node temp = node.left;

		while (temp.right != null) {
			temp = temp.right;
		}

		return temp;
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
		root = a.insert(root, 20);
		root = a.insert(root, 5);

		Node inorderPredecessor = a.getInorderPredecessor(root, 7);
		if (inorderPredecessor != null) {
			System.out.println("Inorder Predecessor: " + inorderPredecessor.data);
		} else {
			System.out.println("Inorder Predecessor doesn't exists");
		}
	}

}