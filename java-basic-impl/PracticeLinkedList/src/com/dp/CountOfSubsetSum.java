package com.dp;

public class CountOfSubsetSum {

	

	public static int countSubsetsWithSumEqualToGivenSum(int[] arr, int sum) {
		if (arr.length == 0 || sum <= 0) {
			return 0;
		}

		int n = arr.length;

		int[][] count = new int[n][sum + 1];

		for (int i = 0; i < n; i++) {
			count[i][0] = 1;
		}

		for (int j = 0; j <= sum; j++) {
			if (arr[0] == j) {
				count[0][j] = 1;
			}
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= sum; j++) {

				int includingCurrentValue = 0;
				int excludingCurrentValue = 0;

				if (arr[i] <= j) {
					includingCurrentValue = count[i - 1][j - arr[i]];
				}

				excludingCurrentValue = count[i - 1][j];

				count[i][j] = includingCurrentValue + excludingCurrentValue;
			}
		}

		return count[n - 1][sum];
	}

	public static void main(String[] args) {

		int[] arr = { 6, 2, 3, 7, 1, 4, 5 };

		int sum = 7;

		System.out.println(CountOfSubsetSum.countSubsetsWithSumEqualToGivenSum(arr, sum));

	}

}

//-------------------------------------------------------------------------------

/*
 
  			377. Combination Sum IV
 
 			Input: nums = [1,2,3], target = 4 Output: 7
 
 
 public int combinationSum4(int[] nums, int target) {
		if (target == 0) {
			return 1;
		}
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			if (target >= nums[i]) {
				res += combinationSum4(nums, target - nums[i]);
			}
		}
		return res;
	}

	or

	private int[] dp;

	public int combinationSum4(int[] nums, int target) {
		dp = new int[target + 1];
		Arrays.fill(dp, -1);
		dp[0] = 1;
		return helper(nums, target);
	}

	private int helper(int[] nums, int target) {
		if (dp[target] != -1) {
			return dp[target];
		}
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			if (target >= nums[i]) {
				res += helper(nums, target - nums[i]);
			}
		}
		dp[target] = res;
		return res;
	}

	The above solution is top-down.How about a bottom-up one?

	public int combinationSum4(int[] nums, int target) {
		int[] comb = new int[target + 1];
		comb[0] = 1;
		for (int i = 1; i < comb.length; i++) {
			for (int j = 0; j < nums.length; j++)
				if (i - nums[j] >= 0)
					comb[i] += comb[i - nums[j]];
		}
		return comb[target];
	}
 */