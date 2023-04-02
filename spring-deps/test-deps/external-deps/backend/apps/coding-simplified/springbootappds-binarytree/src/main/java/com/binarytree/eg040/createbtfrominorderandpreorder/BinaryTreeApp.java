package com.binarytree.eg040.createbtfrominorderandpreorder;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	int preIndex;

	public Node buildTreeFromInOrderPreOrder(int preorderArray[], int inorderArray[], int start, int end) {
		if (start > end) {
			return null;
		}

		Node node = createNewNode(preorderArray[preIndex++]);

		if (start == end) {
			return node;
		}

		int inoderIndex = getInorderIndex(node.data, inorderArray, start, end);

		node.left = buildTreeFromInOrderPreOrder(preorderArray, inorderArray, start, inoderIndex - 1);
		node.right = buildTreeFromInOrderPreOrder(preorderArray, inorderArray, inoderIndex + 1, end);

		return node;
	}

	private int getInorderIndex(int val, int in[], int start, int end) {
		for (int i = start; i <= end; i++) {
			if (in[i] == val) {
				return i;
			}
		}

		return -1;
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

		Node root = null;
		int[] preorderArray = { 2, 4, 7, 3, 8 };
		int[] inorderArray = { 7, 4, 3, 2, 8 };

		root = a.buildTreeFromInOrderPreOrder(preorderArray, inorderArray, 0, inorderArray.length - 1);

	}

}