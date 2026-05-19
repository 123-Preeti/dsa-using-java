package com.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Notes {

//			Max value element in Binary Search Tree
	public int getMax(Node node) {
		if (node == null) {
			System.out.println("Tree is EMpty");
			return -1;
		}

		while (node.right != null) {
			node = node.right;
		}

		return node.data;
	}

//	Get Difference of Even & Odd level values
	public int getDifferenceEvenOddLevel(Node node) {
		if (node == null) {
			return 0;
		}

		return node.data - getDifferenceEvenOddLevel(node.left) - getDifferenceEvenOddLevel(node.right);
	}

//			Get Kth Smallest element in given BST
	int countElement = 0;

	public Node getKthSmallestElementBST(Node node, int k) {
		if (node == null) {
			return null;
		}

		Node left = getKthSmallestElementBST(node.left, k);

		if (left != null) {
			return left;
		}

		countElement++;
		if (countElement == k) {
			return node;
		}

		return getKthSmallestElementBST(node.right, k);
	}

//		task - Get Kth largest element in given BST

//	Construct Balanced BST from given values
	public Node constructBalancedBST(int[] arr) {
		Arrays.sort(arr);

		return constructBalancedBSTUtil(arr, 0, arr.length - 1);
	}

	public Node constructBalancedBSTUtil(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;

		Node node = createNewNode(arr[mid]);

		node.left = constructBalancedBSTUtil(arr, start, mid - 1);
		node.right = constructBalancedBSTUtil(arr, mid + 1, end);

		return node;
	}

	public Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

//	Create BST from given PostOrder Traversal
	public Node createBSTFromPostOrder(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}

		Node node = createNewNode(arr[end]);

		int i;
		for (i = end - 1; i >= start; i--) {
			if (arr[i] < node.data) {
				break;
			}
		}

		node.left = createBST(arr, start, i);
		node.right = createBST(arr, i + 1, end - 1);

		return node;
	}

//	Create BST from given PreOrder Traversal

	public Node createBST(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}

		Node node = createNewNode(arr[start]);

		int i;
		for (i = start + 1; i <= end; i++) {
			if (arr[i] > node.data) {
				break;
			}
		}

		node.left = createBST(arr, start + 1, i - 1);
		node.right = createBST(arr, i, end);

		return node;
	}

//	Find the closest element for a given value in BST

	public Node findClosestElementForGivenValue(Node node, int value) {
		if (node == null) {
			return null;
		}

		int minDiff = Integer.MAX_VALUE;
		Node closestElementNode = null;

		while (node != null) {
			int currentDiff = Math.abs(node.data - value);

			if (currentDiff < minDiff) {
				minDiff = currentDiff;
				closestElementNode = node;
			}

			if (value < node.data) {
				node = node.left;
			} else if (value > node.data) {
				node = node.right;
			} else {
				break;
			}
		}

		return closestElementNode;
	}
	
	
	
	
	
//	662. Maximum Width of Binary Tree
	public int widthOfBinaryTree(Node root) {
        if(root==null)
            return 0;
        
        Queue<Node>queue = new LinkedList<>();
        HashMap<Node, Integer>map = new HashMap<>();
        
        queue.add(root);
        map.put(root, 0);
        
        int min=0, max=0;
        int maxwidth = 0;
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            
            for(int i=0;i<size;i++){          
                Node node = queue.poll();
                
                if(i==0)
                    min = map.get(node);
              
                if(i==size-1)
                    max = map.get(node);
                    
                if(node.left!=null){
                    queue.add(node.left);
                    map.put(node.left, 2*map.get(node));
                }
                
                if(node.right!=null){
                    queue.add(node.right);
                    map.put(node.right, 2*map.get(node) + 1);
                }                              
                map.remove(node);
            }    
            maxwidth = Math.max(maxwidth, max-min+1);
        }
        return maxwidth;
    }
	
//	or
	
	public int widthOfBinaryTreeusingDfs(Node root) {
        return dfs(root, 0, 1, new ArrayList<Integer>(), new ArrayList<Integer>());
    }
    
    public int dfs(Node root, int level, int order, List<Integer> start, List<Integer> end){
        if(root == null)return 0;
        if(start.size() == level){
            start.add(order); end.add(order);
        }
        else end.set(level, order);
        int cur = end.get(level) - start.get(level) + 1;
        int left = dfs(root.left, level + 1, 2*order, start, end);
        int right = dfs(root.right, level + 1, 2*order + 1, start, end);
        return Math.max(cur, Math.max(left, right));
    }
}
