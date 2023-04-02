package com.binarysearchtree.eg015.checkifthereexistatripletwithgivensum;

import java.util.ArrayList;
import java.util.List;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	public boolean checkIfPairExists(Node node, int sum) {
		List<Integer> list = new ArrayList<>();

		inorder(node, list);
		return checkIfPairExistsUtil(sum, list);
	}

	public void inorder(Node node, List<Integer> list) {
		if (node == null) {
			return;
		}

		inorder(node.left, list);

		list.add(node.data);

		inorder(node.right, list);
	}

	private boolean checkIfPairExistsUtil(int sum, List<Integer> list) {
		int elementSize = list.size();

		for (int i = 0; i < elementSize - 2; i++) {
			int start = i + 1;
			int end = elementSize - 1;

			while (start < end) {
				int currentSum = list.get(i) + list.get(start) + list.get(end);

				if (currentSum == sum) {
					return true;
				} else if (currentSum < sum) {
					start++;
				} else {
					end--;
				}
			}

		}

		return false;
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

		System.out.println(a.checkIfPairExists(root, 29));
	}

}