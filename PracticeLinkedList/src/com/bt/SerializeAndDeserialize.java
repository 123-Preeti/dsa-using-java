package com.bt;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeserialize {
	public static void serialize(Node node, List<Integer> list) {
		if (node == null) {
			list.add(-1);
			return;
		}

		list.add(node.data);

		serialize(node.left, list);
		serialize(node.right, list);
	}

	static int deSerializeIndex = 0;

	public static Node deSerialize(List<Integer> list) {
		if (list.get(deSerializeIndex) == -1) {
			deSerializeIndex++;
			return null;
		}

		Node newNode = new BinaryTree().createNewNode(list.get(deSerializeIndex++));

		newNode.left = deSerialize(list);
		newNode.right = deSerialize(list);

		return newNode;
	}

	public static void main(String[] args) {

		BinaryTree a = new BinaryTree();

		Node root = a.createNewNode(2);
		root.left = a.createNewNode(7);
		root.left.left = a.createNewNode(10);
		root.left.right = a.createNewNode(6);
		root.right = a.createNewNode(9);
		root.right.right = a.createNewNode(3);

		List<Integer> list = new ArrayList<>();
		serialize(root, list);

		root = deSerialize(list);

	}
}
