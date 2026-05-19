package com.bst;

import java.util.ArrayList;
import java.util.List;

public class CheckIfElementsOfTwoBSTAresame {
	public static boolean checkIfTwoBSTContainSameElement(Node node1, Node node2) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		inorder(node1, list1);
		inorder(node2, list2);

		return list1.equals(list2);

	}

	public static void inorder(Node node, List<Integer> list) {
		if (node == null) {
			return;
		}

		inorder(node.left, list);

		list.add(node.data);

		inorder(node.right, list);
	}

	public static void main(String[] args) {
		BST a = new BST();
		Node root1 = null;

		root1 = a.insert(root1, 8);
		root1 = a.insert(root1, 15);
		root1 = a.insert(root1, 6);
		root1 = a.insert(root1, 2);
		root1 = a.insert(root1, 7);
		root1 = a.insert(root1, 20);

		Node root2 = null;

		root2 = a.insert(root2, 8);
		root2 = a.insert(root2, 15);
		root2 = a.insert(root2, 6);
		root2 = a.insert(root2, 2);
		root2 = a.insert(root2, 7);
		root2 = a.insert(root2, 20);

		System.out.println(checkIfTwoBSTContainSameElement(root1, root2));

	}
}
