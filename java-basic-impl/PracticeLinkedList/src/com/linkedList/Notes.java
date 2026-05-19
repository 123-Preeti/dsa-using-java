package com.linkedList;

public class Notes {
//	Find sum of Last n nodes in Linked List

	public int getSumOfLastNNodes(Node node, int n) {
		if (node == null || n <= 0) {
			return 0;
		}

		int sum = 0;
		Node head = node;

		while (node != null && n > 0) {
			sum = sum + node.data;
			node = node.next;
			n--;
		}

		if (node == null) {
			if (n > 0) {
				System.out.println("N is greater than total nodes");
				return 0;
			} else {
				return sum;
			}
		}

		while (node.next != null) {
			node = node.next;
			head = head.next;
		}

		head = head.next;
		sum = 0;

		while (head != null) {
			sum = sum + head.data;
			head = head.next;
		}

		return sum;
	}

//	Compare two strings represented as linked lists
	public int compareString(Node head1, Node head2) {
		if (head1 == null && head2 == null) {
			return 0;
		}

		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				return -1;
			} else if (head1.data > head2.data) {
				return 1;
			}

			head1 = head1.next;
			head2 = head2.next;
		}

		if (head1 == null && head2 == null) {
			return 0;
		}

		return head1 != null ? 1 : -1;
	}

//	Remove every Kth Node in Linked list
	public Node removeEveryKthNode(Node node, int k) {
		if (node == null || k <= 1) {
			return null;
		}

		if (node.next == null && k > 1) {
			System.out.println("Not a valid case");
			return node;
		}

		Node head = node;
		int i = 1;

		while (node != null && node.next != null) {
			if (i % (k - 1) == 0) {
				node.next = node.next.next;
			}

			node = node.next;
			i++;
		}

		return head;
	}

//	Move all occurrences of an element to the end of list
	public Node moveAllOccurrenceOfElementToEnd(Node head, int value) {
		if (head == null || head.next == null) {
			return head;
		}

		Node node, tail, prev, next, temp;
		node = head;
		prev = null;

		while (node.next != null) {
			node = node.next;
		}

		tail = node;
		temp = tail;
		node = head;

		while (node != temp) {
			if (node.data == value && prev == null) {
				next = node.next;
				tail.next = node;
				tail = tail.next;
				node.next = null;
				node = head = next;
			} else if (node.data == value && prev != null) {
				next = node.next;
				prev.next = node.next;
				tail.next = node;
				tail = tail.next;
				node.next = null;
				node = next;
			} else {
				prev = node;
				node = node.next;
			}
		}

		return head;
	}
//	Sort linked list which is already sorted on absolute value

	public Node sortWhichIsSortedOnAbsoluteValue(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node node, next, prev;

		node = next = head;
		prev = null;

		if (head.data < 0) {
			prev = node;
			node = node.next;
		}

		while (node != null) {
			if (node.data < 0) {
				prev.next = node.next;
				next = node.next;
				node.next = head;
				head = node;
				node = next;
			} else {
				prev = node;
				node = node.next;
			}
		}

		return head;
	}

//	 Swap nodes of given values without swapping data

	public Node swapNodes(Node node, int a, int b) {
		if (node == null || node.next == null) {
			return node;
		}

		Node t1, t2, head, prev1, prev2;
		prev1 = prev2 = t1 = t2 = null;

		head = node;

		while (node != null) {
			if (node.data == a) {
				t1 = node;
				break;
			}
			prev1 = node;
			node = node.next;
		}

		node = head;

		while (node != null) {
			if (node.data == b) {
				t2 = node;
				break;
			}
			prev2 = node;
			node = node.next;
		}

		if (t1 == null || t2 == null) {
			return head;
		}

		if (prev1 != null) {
			prev1.next = t2;
		} else {
			head = t2;
		}

		if (prev2 != null) {
			prev2.next = t1;
		} else {
			head = t1;
		}

		Node tmp = t1.next;
		t1.next = t2.next;
		t2.next = tmp;

		return head;
	}
}
