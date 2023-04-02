package com.binarytree.eg013.printvaluesinlevelordertraversalwithoutusingrecursionusequeue;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {
	/*
	 * It'll print all values in Level order Line by Line in Binary Tree
	 */
	public void levelOrderTraversalUsingQueueLineByLine(Node node) {
		if (node == null) {
			return;
		}

		Queue<Node> a = new LinkedList<Node>();
		a.add(node);

		while (true) {

			int queueSize = a.size();
			if (queueSize == 0) {
				break;
			}

			while (queueSize > 0) {

				Node temp = a.peek();
				System.out.print(temp.data + " ");

				a.remove();

				if (temp.left != null) {
					a.add(temp.left);
				}

				if (temp.right != null) {
					a.add(temp.right);
				}

				queueSize--;
			}

			System.out.println();
		}
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
		root.left.left = a.createNewNode(2);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);
		root.right.right = a.createNewNode(9);
		root.right.right.left = a.createNewNode(4);

		a.levelOrderTraversalUsingQueueLineByLine(root);
	}

}