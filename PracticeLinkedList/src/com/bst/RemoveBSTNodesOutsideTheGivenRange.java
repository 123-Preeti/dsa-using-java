package com.bst;

public class RemoveBSTNodesOutsideTheGivenRange {
	public static Node removeBSTKeysOutsideGivenRange(Node node, int min, int max) {
		if (node == null) {
			return null;
		}

		node.left = removeBSTKeysOutsideGivenRange(node.left, min, max);
		node.right = removeBSTKeysOutsideGivenRange(node.right, min, max);

		if (node.data < min) {
			return node.right;
		} else if (node.data > max) {
			return node.left;
		}

		return node;
	}

	public static void main(String[] args) {
		BST a = new BST();
		Node root = null;

		root = a.insert(root, 8);
		root = a.insert(root, 15);
		root = a.insert(root, 6);
		root = a.insert(root, 2);
		root = a.insert(root, 7);
		root = a.insert(root, 20);
		root = a.insert(root, 5);
		root = a.insert(root, 12);
		root = a.insert(root, 3);

		root = removeBSTKeysOutsideGivenRange(root, 4, 12);

	}
}
