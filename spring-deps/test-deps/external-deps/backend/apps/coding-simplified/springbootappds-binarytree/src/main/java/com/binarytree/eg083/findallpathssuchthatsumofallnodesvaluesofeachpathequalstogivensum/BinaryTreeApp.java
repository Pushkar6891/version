package com.binarytree.eg083.findallpathssuchthatsumofallnodesvaluesofeachpathequalstogivensum;

import java.util.ArrayList;
import java.util.List;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	List<Integer> elements = new ArrayList<Integer>();

	public void printKPathEqualToSum(Node node, int val) {
		if (node == null) {
			return;
		}

		elements.add(node.data);

		printKPathEqualToSum(node.left, val);
		printKPathEqualToSum(node.right, val);

		int sum = 0;

		for (int i = elements.size() - 1; i >= 0; i--) {

			sum = sum + elements.get(i);

			if (sum == val) {

				for (int j = i; j < elements.size(); j++) {
					System.out.print(elements.get(j) + " ");
				}

				System.out.println();
			}
		}

		elements.remove(elements.size() - 1);
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
		root.left = a.createNewNode(4);
		root.left.left = a.createNewNode(1);
		root.left.right = a.createNewNode(6);
		root.right = a.createNewNode(5);
		root.right.right = a.createNewNode(7);

		a.printKPathEqualToSum(root, 6);

	}
}