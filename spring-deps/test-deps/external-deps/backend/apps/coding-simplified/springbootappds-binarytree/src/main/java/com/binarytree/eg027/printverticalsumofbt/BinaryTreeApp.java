package com.binarytree.eg027.printverticalsumofbt;

import java.util.Map;
import java.util.TreeMap;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public void getVerticalSum(Node node) {
		if (node == null) {
			return;
		}

		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();

		verticalSum(node, 0, m);

		if (m != null) {
			System.out.println(m.values());
		}
	}

	public void verticalSum(Node node, int d, Map<Integer, Integer> m) {
		if (node == null) {
			return;
		}

		verticalSum(node.left, d - 1, m);

		int s = (m.get(d) == null) ? 0 : m.get(d);
		m.put(d, s + node.data);

		verticalSum(node.right, d + 1, m);
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

		a.getVerticalSum(root);
	}

}