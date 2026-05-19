package com.linkedList;

public class MergeK_SortedLL {
	public static Node mergeKSortedLists(Node[] arr, int last) {
		while (last != 0) {
			int i = 0;
			int j = last;

			while (i < j) {
				arr[i] = mergeTwoSortedLinkedList(arr[i], arr[j]);

				i++;
				j--;

				if (i >= j) {
					last = j;
					break;
				}
			}
		}

		return arr[0];
	}

	/*
	 * It merges two sorted linked list
	 */
	public static Node mergeTwoSortedLinkedList(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return null;
		}

		if (node1 == null || node2 == null) {
			return node1 != null ? node1 : node2;
		}

		return mergeTwoList(node1, node2);
	}

	/*
	 * Helper function to merge two sorted linked list
	 */
	public static Node mergeTwoList(Node first, Node second) {
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
	public static void main(String[] args) {
	    Linked a = new Linked();
	    
	    Node arr[] = new Node[5];
	    
	    arr[0] = a.getNewNode(1);
	    arr[0].next = a.getNewNode(3);
	    arr[0].next.next = a.getNewNode(5);
	    arr[0].next.next.next = a.getNewNode(7);
	    
	    arr[1] = a.getNewNode(2);
	    arr[1].next = a.getNewNode(4);
	    arr[1].next.next = a.getNewNode(6);
	    arr[1].next.next.next = a.getNewNode(8);
	    
	    arr[2] = a.getNewNode(0);
	    arr[2].next = a.getNewNode(9);
	    arr[2].next.next = a.getNewNode(10);
	    arr[2].next.next.next = a.getNewNode(11);
	    
	    arr[3] = a.getNewNode(12);
	    arr[3].next = a.getNewNode(14);
	    arr[3].next.next = a.getNewNode(16);
	    arr[3].next.next.next = a.getNewNode(18);
	    
	    arr[4] = a.getNewNode(0);
	    arr[4].next = a.getNewNode(19);
	    arr[4].next.next = a.getNewNode(20);
	    arr[4].next.next.next = a.getNewNode(31);
	    
	    Node mergedList = mergeKSortedLists(arr, arr.length - 1);
	    a.printList(mergedList);
	    
	  }

}
