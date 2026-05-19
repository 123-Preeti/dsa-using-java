package com.linkedList;

public class LengthOfLongestPalindromeList {
	public int lengthOfLongestPalindrome(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.next == null) {
			return 1;
		}

		Node next, prev;
		prev = next = null;
		int result = 1;

		while (node != null) {
			next = node.next;
			node.next = prev;

			result = Math.max(result, 2 * getCommonElementCount(prev, next) + 1);
			result = Math.max(result, 2 * getCommonElementCount(node, next));

			prev = node;
			node = next;
		}

		return result;
	}

	public int getCommonElementCount(Node a, Node b) {
		int count = 0;

		while (a != null && b != null) {
			if(a.data == b.data) {
				count++;
			} else {
				break;
			}

			a = a.next;
			b = b.next;
		}

		return count;
	}

}
