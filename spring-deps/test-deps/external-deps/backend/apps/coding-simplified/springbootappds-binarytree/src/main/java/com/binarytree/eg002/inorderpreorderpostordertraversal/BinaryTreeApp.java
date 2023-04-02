package com.binarytree.eg002.inorderpreorderpostordertraversal;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public void inorder(Node node) {
		if (node == null) {
			return;
		}

		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	public void preorder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}

	public void postorder(Node node) {
		if (node == null) {
			return;
		}

		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
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

		System.out.print("LR'R Inorder: ");
		a.inorder(root);
		System.out.println();

		System.out.print("RLR PreOrder: ");
		a.preorder(root);
		System.out.println();

		System.out.print("LRR' PostOrder: ");
		a.postorder(root);
		System.out.println();
	}

}

//								2 
//						7					5
//				2			6			5		11
//			9		4
//
//