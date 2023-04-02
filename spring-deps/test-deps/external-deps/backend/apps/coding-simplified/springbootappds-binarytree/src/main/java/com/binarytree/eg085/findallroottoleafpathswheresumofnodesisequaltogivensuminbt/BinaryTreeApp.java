package com.binarytree.eg085.findallroottoleafpathswheresumofnodesisequaltogivensuminbt;

import java.util.ArrayList;
import java.util.List;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public List<List<Integer>> showAllSumPath(Node node, int sum) {
		List<List<Integer>> allSumPathList = new ArrayList<>();

		List<Integer> singlePath = new ArrayList<>();

		sumPathUtil(node, sum, allSumPathList, singlePath);

		return allSumPathList;
	}

	public void sumPathUtil(Node node, int sum, List<List<Integer>> allSumPathList, List<Integer> singlePath) {
		if (node == null) {
			return;
		}

		singlePath.add(node.data);

		if (node.left == null && node.right == null && node.data == sum) {
			allSumPathList.add(new ArrayList<>(singlePath));
		} else {
			sumPathUtil(node.left, sum - node.data, allSumPathList, singlePath);
			sumPathUtil(node.right, sum - node.data, allSumPathList, singlePath);
		}

		singlePath.remove(singlePath.size() - 1);
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

		Node root = a.createNewNode(1);
		root.left = a.createNewNode(2);
		root.right = a.createNewNode(6);
		root.left.left = a.createNewNode(3);
		root.left.left.left = a.createNewNode(5);
		root.left.right = a.createNewNode(4);

		System.out.println(a.showAllSumPath(root, 7));
	}
}