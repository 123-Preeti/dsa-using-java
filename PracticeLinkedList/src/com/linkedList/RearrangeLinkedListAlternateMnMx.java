package com.linkedList;

public class RearrangeLinkedListAlternateMnMx {
	public Node rearrangeLinkedListAlternateMinMaxElements(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		head = sortLinkedList(head);

		Node middleNode = getMiddleNode(head);
		Node nextList = middleNode.next;
		middleNode.next = null;

		Node reversedList = reverse(nextList);
		Node firstList = head;

		Node node = new Node();
		Node finalList = node;

		while (firstList != null || reversedList != null) {

			if (firstList != null) {
				node.next = firstList;
				node = node.next;
				firstList = firstList.next;
			}

			if (reversedList != null) {
				node.next = reversedList;
				node = node.next;
				reversedList = reversedList.next;
			}
		}

		return finalList.next;
	}

	public Node sortLinkedList(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node middle = getMiddleNode(node);
		Node second = middle.next;
		middle.next = null;

		return mergeTwoList(sortLinkedList(node), sortLinkedList(second));
	}

	public Node mergeTwoList(Node first, Node second) {
		if (first == null && second == null) {
			return null;
		}

		Node tmp = new Node();
		Node finalList = tmp;
		while (first != null && second != null) {
			if (first.data < second.data) {
				tmp.next = first;
				first = first.next;
			} else {
				tmp.next = second;
				second = second.next;
			}

			tmp = tmp.next;
		}

		tmp.next = (first != null) ? first : second;

		return finalList.next;
	}

	public Node getMiddleNode(Node node) {
		Node slow, fast;

		slow = fast = node;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public Node reverse(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node prev, next;
		prev = next = null;

		while (node != null) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}

		return prev;
	}
	// Rearrange a given linked list in-place

	public Node rearrangeLinkedListInPlace(Node head) {
		if (head == null || head.next == null || head.next.next == null) {
			return head;
		}

		Node middleNode = getMiddleNode(head);
		Node nextList = middleNode.next;
		middleNode.next = null;

		Node reversedList = reverse(nextList);
		Node firstList = head;

		Node finalList = new Node();
		Node node = finalList;

		while (firstList != null || reversedList != null) {

			if (firstList != null) {
				node.next = firstList;
				node = node.next;
				firstList = firstList.next;
			}

			if (reversedList != null) {
				node.next = reversedList;
				node = node.next;
				reversedList = reversedList.next;
			}
		}

		return finalList.next;
	}

}
