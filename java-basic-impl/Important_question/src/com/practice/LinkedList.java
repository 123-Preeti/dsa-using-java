package com.practice;

class Node {
	int data;
	Node next;
}

public class LinkedList {
	static Node root = new Node();

	public static Node createNewNode(int key) {
		Node newNode = new Node();
		newNode.data = key;
		newNode.next = null;
		return newNode;
	}

	public static void printLinkedList(Node head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		printLinkedList(head.next);
	}

	public static void insertNewNode(Node node, int Data) {
		if (node == null) {
			createNewNode(Data);
			return;
		}
		while (node.next != null) {
			node = node.next;
		}
		node.next = createNewNode(Data);
		return;
	}

	public static void insertAtPosition(Node head, int data, int position) {
		if (position == 1) {
			Node newNode = createNewNode(data);
			newNode.next = head;
			root = newNode;
			return;
		}
		
	}

	public static Node insertAtFront(Node head, int data) {
		if (head == null)
			return createNewNode(data);
		Node temp = createNewNode(data);
		temp.next = head;
		return temp;
	}

	public static void deleteAtFront(Node head) {
		root = head.next;
	}
	public static void deleteAtPosition(Node head, int pos) {
		int count = 1;
		Node prev = null;
		while(count != pos) {
			prev = head;
			head = head.next;
			count++;
		}
		prev.next = head.next;
		root = prev;
	}
	public static void main(String args[]) {
		root = createNewNode(2);
		root.next = createNewNode(5);
		root.next.next = createNewNode(8);
		insertNewNode(root, 15);
		insertNewNode(root, 16);
		insertNewNode(root, 17);
		insertNewNode(root, 18);
		insertAtPosition(root, 100, 1);
		
		printLinkedList(root);
	}
}
