package com.linkedList;

public class RearrangeLinkedListAroundGivenValueandKeepingOriginalOrder {

	public Node rearrangeLinkedListAroundGivelValueKeepOrder(Node head, int val) {
		if (head == null || head.next == null) {
			return head;
		}

		Node lessValueStartNode, lessValueEndNode, givenValueStartNode, givenValueEndNode, greaterValuesStartNode,
				greaterValuesEndNode;

		lessValueEndNode = lessValueStartNode = null;
		givenValueStartNode = givenValueEndNode = null;
		greaterValuesStartNode = greaterValuesEndNode = null;

		Node node = head;

		while (node != null) {
			if (node.data < val) {
				if (lessValueStartNode == null) {
					lessValueStartNode = lessValueEndNode = node;
				} else {
					lessValueEndNode.next = node;
					lessValueEndNode = node;
				}
			} else if (node.data == val) {
				if (givenValueStartNode == null) {
					givenValueStartNode = givenValueEndNode = node;
				} else {
					givenValueEndNode.next = node;
					givenValueEndNode = node;
				}
			} else {
				if (greaterValuesStartNode == null) {
					greaterValuesStartNode = greaterValuesEndNode = node;
				} else {
					greaterValuesEndNode.next = node;
					greaterValuesEndNode = node;
				}
			}
			node = node.next;
		}

		lessValueEndNode.next = givenValueStartNode;
		givenValueEndNode.next = greaterValuesStartNode;

		greaterValuesEndNode.next = null;

		return lessValueStartNode;
	}
}
