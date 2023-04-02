package com.binarytree.eg075.connectnodesatsamelevelwithnextpointer;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	Node next;
	int data;
}

class BinaryTree {

	public void connectNode(Node node) {
		Node previousNode;

		Queue<Node> q = new LinkedList<>();
		q.add(node);

		while (!q.isEmpty()) {
			int size = q.size();

			previousNode = null;

			while (size > 0) {
				node = q.remove();

				if (previousNode != null) {
					previousNode.next = node;
				}

				previousNode = node;

				if (node.left != null) {
					q.add(node.left);
				}

				if (node.right != null) {
					q.add(node.right);
				}

				size--;
			}
		}
	}

	public void connectNodeAtSameLevel(Node node) {
		if (node == null) {
			return;
		}

		while (node != null) {
			Node t = node;

			while (t != null) {
				if (t.left != null) {
					if (t.right != null) {
						t.left.next = t.right;
					} else {
						t.left.next = getNextRight(t);
					}
				}

				if (t.right != null) {
					t.right.next = getNextRight(t);
				}

				t = t.next;
			}

			if (node.left != null) {
				node = node.left;
			} else if (node.right != null) {
				node = node.right;
			} else {
				node = getNextRight(node);
			}
		}
	}

	public Node getNextRight(Node node) {
		Node tmp = node.next;

		while (tmp != null) {
			if (tmp.left != null) {
				return tmp.left;
			} else if (tmp.right != null) {
				return tmp.right;
			}
			tmp = tmp.next;
		}
		return null;
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

		Node root = a.createNewNode(12);
		root.left = a.createNewNode(7);
		root.left.left = a.createNewNode(6);
		root.left.right = a.createNewNode(9);
		root.right = a.createNewNode(24);

		a.connectNode(root);
	}
}