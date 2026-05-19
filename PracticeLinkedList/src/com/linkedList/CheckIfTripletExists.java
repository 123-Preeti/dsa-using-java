package com.linkedList;

public class CheckIfTripletExists {

	public static boolean isTripletExistForSum(Node node1, Node node2, Node node3, int val) {

		Node head2, head3;
		head2 = node2;
		head3 = node3;

		while (node1 != null) {
			while (node2 != null && node3 != null) {

				int s = node1.data + node2.data + node3.data;

				if (s == val) {
					return true;
				} else if (s > val) {
					node3 = node3.next;
				} else {
					node2 = node2.next;
				}
			}

			node1 = node1.next;
			node2 = head2;
			node3 = head3;
		}

		return false;
	}

	public static void main(String[] args) {
		Linked a = new Linked();

		Node head1 = null;
		head1 = a.insert(head1, 5);
		head1 = a.insert(head1, 2);
		head1 = a.insert(head1, 9);

		a.printList(head1);
		System.out.println();

		Node head2 = null;
		head2 = a.insert(head2, 2);
		head2 = a.insert(head2, 3);
		head2 = a.insert(head2, 7);

		a.printList(head2);
		System.out.println();

		Node head3 = null;
		head3 = a.insert(head3, 12);
		head3 = a.insert(head3, 8);
		head3 = a.insert(head3, 4);

		a.printList(head3);
		System.out.println();

		System.out.println(isTripletExistForSum(head1, head2, head3, 13));
		System.out.println(isTripletExistForSum(head1, head2, head3, 14));
	}
}