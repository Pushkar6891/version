package com.binarytree.eg076.connectnextpointerofnodetolevelodersuccessor;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	Node next;
	int data;
}

class BinaryTree {

	public void connectNodeLevelSuccessor(Node node) {
		Node previousNode = null;

		Queue<Node> q = new LinkedList<>();
		q.add(node);

		while (!q.isEmpty()) {
			int size = q.size();

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
		root.left = a.createNewNode(4);
		root.left.left = a.createNewNode(2);
		root.left.left.left = a.createNewNode(1);
		root.left.right = a.createNewNode(6);
		root.left.right.right = a.createNewNode(3);
		root.right = a.createNewNode(20);
		root.right.right = a.createNewNode(27);
		root.right.right.right = a.createNewNode(40);

		a.connectNodeLevelSuccessor(root);
	}
}