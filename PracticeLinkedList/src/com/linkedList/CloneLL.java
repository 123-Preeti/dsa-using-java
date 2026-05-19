package com.linkedList;

import java.util.HashMap;

class Node1 {
	Node1 next;
	Node1 random;
	int data;
}

class LinkedList {
	public Node1 createNewNode1(int i) {
		Node1 a = new Node1();
		a.data = i;
		a.next = null;
		a.random = null;
		return a;
	}

	public Node1 clone(Node1 node) {
		if (node == null) {
			return node;
		}

		Node1 first = node;
		Node1 next = null;

		while (node != null) {
			Node1 newNode1 = createNewNode1(node.data);
			next = node.next;
			node.next = newNode1;
			newNode1.next = next;

			node = next;
		}

		node = first;

		while (node != null) {
			node.next.random = node.random.next;
			node = node.next != null ? node.next.next : node.next;
		}

		node = first;
		Node1 copy = node.next;
		Node1 tempCopy = copy;

		while (node != null && copy != null) {
			node.next = node.next != null ? node.next.next : node.next;
			copy.next = copy.next != null ? copy.next.next : copy.next;

			node = node.next;
			copy = copy.next;
		}

		return tempCopy;
	}

	public Node1 cloneUsingHashmap(Node1 firstHead) {
		if (firstHead == null) {
			return null;
		}

		HashMap<Node1, Node1> m = new HashMap<>();
		Node1 secondHead = null, secondNode1 = null;
		Node1 firstNode1 = firstHead;

		while (firstNode1 != null) {
			Node1 newNode1 = createNewNode1(firstNode1.data);
			if (secondHead == null) {
				secondHead = newNode1;
				secondNode1 = secondHead;
			} else {
				secondNode1.next = newNode1;
				secondNode1 = newNode1;
			}

			m.put(firstNode1, secondNode1);
			firstNode1 = firstNode1.next;
		}

		firstNode1 = firstHead;
		secondNode1 = secondHead;

		while (firstNode1 != null) {
			if (firstNode1.random != null) {
				secondNode1.random = m.get(firstNode1.random);
			}

			firstNode1 = firstNode1.next;
			secondNode1 = secondNode1.next;
		}

		return secondHead;
	}
}

public class CloneLL {

	public static void main(String[] args) {

		LinkedList a = new LinkedList();

		Node1 head = a.createNewNode1(1);
		head.next = a.createNewNode1(2);
		head.next.next = a.createNewNode1(3);
		head.next.next.next = a.createNewNode1(4);
		head.next.next.next.next = a.createNewNode1(5);

		head.random = head.next.next;
		head.next.random = head;
		head.next.next.random = head.next.next.next.next;
		head.next.next.next.random = head.next.next.next.next;
		head.next.next.next.next.random = head.next;

		// Node1 clone = a.clone(head);
		a.cloneUsingHashmap(head);
	}

}
