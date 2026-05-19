package com.linkedList;

public class CheckLinkedListOfStringFormsPalindrome {
	public boolean checkIfLinkedListOfStringFormsPalindrome(Node head) {
		if (head == null) {
			return false;
		}

		if (head.next == null) {
			return true;
		}

		Node middle = getMiddleNode(head);
		middle.next = reverse(middle.next);
		Node secondHalf = middle.next;
		Node second = secondHalf;
		middle.next = null;

		boolean ifPalidrome = true;
		while(head != null && second != null) {
			if (head.data != second.data) {
				return false;
			}

			head = head.next;
			second = second.next;
		}

		if(head != null && second == null) {
			ifPalidrome = true;
		}

		middle.next = reverse(secondHalf);

		return ifPalidrome;
	}

	public Node getMiddleNode(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

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

		Node tmp = reverse(node.next);
		node.next.next = node;
		node.next = null;

		return tmp;
	}
}
