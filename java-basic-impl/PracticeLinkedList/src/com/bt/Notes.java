package com.bt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node1 {
	Node1 left;
	Node1 right;
	Node1 next;
	int data;
}

public class Notes {

//	Connect ‘next’ pointer to it’s Inorder Successor

	Node1 prev;

	public void connectNextPointerToInorderSuccessor(Node1 node) {
		if (node == null) {
			return;
		}

		connectNextPointerToInorderSuccessor(node.left);

		if (prev != null) {
			prev.next = node;
		}

		prev = node;

		connectNextPointerToInorderSuccessor(node.right);
	}

//	Connect Nodes at same level with 'next' pointer
	public void connectNodeAtSameLevel(Node1 node) {
		if (node == null) {
			return;
		}

		while (node != null) {
			Node1 t = node;

			while (t != null) {
				if (t.left != null) {
					if (t.right != null) {
						t.left.next = t.right;
					} else {
						t.left.next = getNextRight(t);
					}
				}

				if (t.right != null) {
					t.right.next = getNextRight(t);
				}

				t = t.next;
			}

			if (node.left != null) {
				node = node.left;
			} else if (node.right != null) {
				node = node.right;
			} else {
				node = getNextRight(node);
			}
		}
	}

	public Node1 getNextRight(Node1 node) {
		Node1 tmp = node.next;

		while (tmp != null) {
			if (tmp.left != null) {
				return tmp.left;
			} else if (tmp.right != null) {
				return tmp.right;
			}
			tmp = tmp.next;
		}
		return null;
	}

//	Connect ‘next' pointer to Level Order Successor Node

	public void connectNodeLevelSuccessor(Node1 node) {
		Node1 previousNode = null;

		Queue<Node1> q = new LinkedList<>();
		q.add(node);

		while (!q.isEmpty()) {
			int size = q.size();

			while (size > 0) {
				node = q.remove();

				if (previousNode != null) {
					previousNode.next = node;
				}

				previousNode = node;

				if (node.left != null) {
					q.add(node.left);
				}

				if (node.right != null) {
					q.add(node.right);
				}
				size--;
			}
		}
	}

//	Check If Parent contains sum of both children

	public boolean ifParentContainSumofChildren(Node node) {
		if (node == null || (node.left == null && node.right == null)) {
			return true;
		}

		int a = node.left != null ? node.left.data : 0;
		int b = node.right != null ? node.right.data : 0;

		return (a + b == node.data) && ifParentContainSumofChildren(node.left)
				&& ifParentContainSumofChildren(node.right);
	}

//	Check if each node contains the sum of left & right subtree (Sum Tree)

	public boolean ifSumTree(Node node) {
		int leftSum;
		int rightSum;

		if (node == null || ifLeafNode(node))
			return true;

		if (ifSumTree(node.left) && ifSumTree(node.right)) {
			if (node.left == null)
				leftSum = 0;
			else if (ifLeafNode(node.left))
				leftSum = node.left.data;
			else
				leftSum = 2 * (node.left.data);

			if (node.right == null)
				rightSum = 0;
			else if (ifLeafNode(node.right))
				rightSum = node.right.data;
			else
				rightSum = 2 * (node.right.data);

			if ((node.data == rightSum + leftSum))
				return true;
			else
				return false;
		}

		return false;
	}

	public boolean ifLeafNode(Node node) {
		if (node == null) {
			return false;
		}

		if (node.left == null && node.right == null) {
			return true;
		}

		return false;
	}

//	Get Diagonal Sum in Binary Tree

	public void diagonalSum(Node node) {
		if (node == null) {
			return;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.add(node);

		while (true) {
			int size = q.size();

			if (size == 0) {
				break;
			}

			int s = 0;

			while (size > 0) {
				Node temp = q.remove();

				while (temp != null) {
					s = s + temp.data;

					if (temp.left != null) {
						q.add(temp.left);
					}

					temp = temp.right;
				}

				size--;
			}

			System.out.println(s);
		}
	}
//	Get Max Sum path between two Leaves

	int maxSumBetweenTwoLeaves = 0;

	public int getMaxSumPathBetweenTwoLeaves(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return node.data;
		}

		int l = getMaxSumPathBetweenTwoLeaves(node.left);
		int r = getMaxSumPathBetweenTwoLeaves(node.right);

		if (node.left != null && node.right != null) {
			if (l + r + node.data > maxSumBetweenTwoLeaves) {
				maxSumBetweenTwoLeaves = l + r + node.data;
			}

			return Math.max(l, r) + node.data;
		}

		return node.left != null ? l + node.data : r + node.data;
	}

//	Get Max Sum Path in Binary Tree

	int maxSum = 0;

	public int maxSumPath(Node node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return node.data;
		}

		int l = maxSumPath(node.left);
		int r = maxSumPath(node.right);

		int max_one = Math.max(node.data, node.data + Math.max(l, r));

		int max_two = Math.max(max_one, l + r + node.data);

		maxSum = Math.max(maxSum, max_two);

		return max_one;
	}

//	Find all paths where sum of all the node values of each path equals given value

	List<Integer> elements = new ArrayList<Integer>();

	public void printKPathEqualToSum(Node node, int val) {
		if (node == null) {
			return;
		}

		elements.add(node.data);

		printKPathEqualToSum(node.left, val);
		printKPathEqualToSum(node.right, val);

		int sum = 0;

		for (int i = elements.size() - 1; i >= 0; i--) {

			sum = sum + elements.get(i);

			if (sum == val) {

				for (int j = i; j < elements.size(); j++) {
					System.out.print(elements.get(j) + " ");
				}

				System.out.println();
			}
		}

		elements.remove(elements.size() - 1);
	}

//	Find all paths from root to leaf where sum of nodes is equal to given sum

	public List<List<Integer>> showAllSumPath(Node node, int sum) {
		List<List<Integer>> allSumPathList = new ArrayList<>();

		List<Integer> singlePath = new ArrayList<>();

		sumPathUtil(node, sum, allSumPathList, singlePath);

		return allSumPathList;
	}

	public void sumPathUtil(Node node, int sum, List<List<Integer>> allSumPathList, List<Integer> singlePath) {
		if (node == null) {
			return;
		}

		singlePath.add(node.data);

		if (node.left == null && node.right == null && node.data == sum) {
			allSumPathList.add(new ArrayList<>(singlePath));
		} else {
			sumPathUtil(node.left, sum - node.data, allSumPathList, singlePath);
			sumPathUtil(node.right, sum - node.data, allSumPathList, singlePath);
		}

		singlePath.remove(singlePath.size() - 1);
	}

//	Check if there exists a pair for given Sum in Binary

	public boolean ifPairExists(Node node, int sum) {
		HashSet<Integer> set = new HashSet<>();

		return ifPairExistsUtil(node, sum, set);
	}

	public boolean ifPairExistsUtil(Node node, int sum, HashSet<Integer> set) {
		if (node == null) {
			return false;
		}

		if (set.contains(sum - node.data)) {
			return true;
		}

		set.add(node.data);

		if (ifPairExistsUtil(node.left, sum, set)) {
			return true;
		}

		return ifPairExistsUtil(node.right, sum, set);
	}

//Get closest leaf node distance from a given value

	public int closestLeafNode(Node node, int val) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		Node arr[] = new Node[10];
		return closestLeafNodeUtil(node, arr, val, 0);
	}

	public int closestLeafNodeUtil(Node node, Node arr[], int val, int level) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		int minDistFromLeaf = Integer.MAX_VALUE;

		if (node.data == val) {
			minDistFromLeaf = getMinDistanceToLeaf(node);

			for (int i = level - 1; i >= 0; i--) {
				minDistFromLeaf = Math.min(minDistFromLeaf, level - i + getMinDistanceToLeaf(arr[i]));
			}

			return minDistFromLeaf;
		}

		arr[level] = node;

		minDistFromLeaf = Math.min(minDistFromLeaf, closestLeafNodeUtil(node.left, arr, val, level + 1));

		if (minDistFromLeaf != Integer.MAX_VALUE) {
			return minDistFromLeaf;
		}

		return Math.min(minDistFromLeaf, closestLeafNodeUtil(node.right, arr, val, level + 1));
	}

	public int getMinDistanceToLeaf(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		if (node.left == null && node.right == null) {
			return 0;
		}

		return 1 + Math.min(getMinDistanceToLeaf(node.left), getMinDistanceToLeaf(node.right));
	}
}
