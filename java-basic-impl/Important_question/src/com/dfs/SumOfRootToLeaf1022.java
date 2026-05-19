package com.dfs;

/*
Input: root = [1,0,1,0,1,0,1]
Output: 22
Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
*/
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class SumOfRootToLeaf1022 {
	public int sumRootToLeaf(TreeNode root) {
		return pathSumRootToLeaf(root, 0);
	}

	private int pathSumRootToLeaf(TreeNode root, int parentNodeSum) {
		if (root == null)
			return 0;

		parentNodeSum = 2 * parentNodeSum + root.val;
		if (root.left == null && root.right == null) {
			return parentNodeSum;
		}

		return pathSumRootToLeaf(root.left, parentNodeSum) + pathSumRootToLeaf(root.right, parentNodeSum);
	}
}
