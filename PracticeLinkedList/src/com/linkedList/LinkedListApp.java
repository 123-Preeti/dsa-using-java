package com.linkedList;

class Node {
	Node next;
	int data;
}
class Linked {
	Node root;

	public Linked() {
		root = null;
	}
	public Node getNewNode(int key) {
		Node a = new Node();
		a.next = null;
		a.data = key;
		return a;
	}
	public Node insert(Node node, int key) {
		if(node == null) 
			return getNewNode(key);
		node.next = insert(node.next, key);
		return node;
	}
	public void printList(Node node) {
		if(node == null)
			return;
		System.out.print(node.data + " ");
		printList(node.next);
	}
	
}
public class LinkedListApp {

	public static void main(String[] args) {
		Node root = null;
		Linked a = new Linked();
		root = a.insert(root, 1);
		root = a.insert(root, 2);
		a.printList(root);
		
	}

}
