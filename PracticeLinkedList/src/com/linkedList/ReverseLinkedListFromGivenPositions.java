package com.linkedList;

public class ReverseLinkedListFromGivenPositions {
	public Node reverseFromGivenPositions(Node node, int p, int q) {
		if (node == null || node.next == null || p >= q || p < 1 || q < 1) {
			return node;
		}

		Node head = node;
		Node prev = null;

		for (int i = 1; node != null && i < p; i++) {
			prev = node;
			node = node.next;
		}

		if (node == null) {
			return head;
		}

		Node firstPartLastNode = prev;
		Node secondPartStartNode = node;
		Node next = null;

		for (int i = 0; node != null && i <= q - p; i++) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}

		if (p != 1) {
			firstPartLastNode.next = prev;
		}

		secondPartStartNode.next = node;

		return p == 1 ? prev : head;

	}
}
