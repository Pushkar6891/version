package com.binarysearchtree.eg010.inordersuccessorofnodeinbst;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	public Node getInorderSuccessor(Node node, int val) {
		if (node == null) {
			return null;
		}

		Node inorderSuccessor = null;

		while (node != null) {
			if (val < node.data) {
				inorderSuccessor = node;
				node = node.left;
			} else if (val > node.data) {
				node = node.right;
			} else {
				if (node.right != null) {
					inorderSuccessor = getSuccessor(node);
				}
				break;
			}
		}
		return node != null ? inorderSuccessor : null;
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

	public Node getSuccessor(Node node) {
		if (node == null) {
			return null;
		}

		Node temp = node.right;

		while (temp.left != null) {
			temp = temp.left;
		}

		return temp;

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
		root = a.insert(root, 3);
		root = a.insert(root, 6);
		root = a.insert(root, 10);
		root = a.insert(root, 4);
		root = a.insert(root, 7);
		root = a.insert(root, 1);
		root = a.insert(root, 14);
		root = a.insert(root, 13);

		Node inorderSuccessor = a.getInorderSuccessor(root, 10);
		if (inorderSuccessor != null) {
			System.out.println("Inorder Successor: " + inorderSuccessor.data);
		} else {
			System.out.println("Inorder Successor doesn't exists");
		}
	}

}

//								8
//						3				10		
//					1		6				14
//						4		7		13	
//

// Inorder : 1 3 4 6 7 8 10 13 14 