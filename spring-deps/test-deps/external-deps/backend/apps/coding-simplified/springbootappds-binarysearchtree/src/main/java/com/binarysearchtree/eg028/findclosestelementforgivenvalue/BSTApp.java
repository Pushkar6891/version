package com.binarysearchtree.eg028.findclosestelementforgivenvalue;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	public Node findClosestElementForGivenValue(Node node, int value) {
		if (node == null) {
			return null;
		}

		int minDiff = Integer.MAX_VALUE;
		Node closestElementNode = null;

		while (node != null) {
			int currentDiff = Math.abs(node.data - value);

			if (currentDiff < minDiff) {
				minDiff = currentDiff;
				closestElementNode = node;
			}

			if (value < node.data) {
				node = node.left;
			} else if (value > node.data) {
				node = node.right;
			} else {
				break;
			}
		}

		return closestElementNode;
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
		root = a.insert(root, 12);

		Node closestElementNode = a.findClosestElementForGivenValue(root, 10);

		if (closestElementNode != null) {
			System.out.println(closestElementNode.data);
		}
	}
}