package com.bst;

public class ParentNode {
//		Parent with just greater than the node
	public static Node getInorderParent(Node node, int val) {
		if (node == null) {
			return null;
		}

		Node inorderParent = null;

		while (node != null) {
			if (val < node.data) {
				inorderParent = node;
				node = node.left;
			} else if (val > node.data) {
				node = node.right;
			} else {
				break;
			}
		}

		return node != null ? inorderParent : null;
	}

//	ye parent dega
	public static Node getParentNode(Node node, int val) {
		if (node == null) {
			return null;
		}

		Node getParent = null;

		while (node != null) {
			if (val < node.data) {
				getParent = node;
				node = node.left;
			} else if (val > node.data) {
				getParent = node;
				node = node.right;
			} else {
				break;
			}
		}

		return getParent;
	}

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

		Node parentNode = getInorderParent(root, 3);
		if (parentNode != null) {
			System.out.println("Parent: " + parentNode.data);
		} else {
			System.out.println("Parent is null");
		}
	}

}
