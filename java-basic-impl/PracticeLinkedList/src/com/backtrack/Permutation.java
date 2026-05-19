package com.backtrack;

import java.util.*;

public class Permutation {

	public static void backtrack(int nums[], int n, List<Integer> l, List<List<Integer>> result) {
		if (l.size() == n) {
			result.add(new LinkedList<>(l));
			return;
		} else {
			for (int k = 0; k < nums.length; k++) {
				if (l.contains(nums[k]))
					continue;
				l.add(nums[k]);
				backtrack(nums, n, l, result);
				l.remove(l.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		List<Integer> l = new LinkedList<>();
		List<List<Integer>> result = new LinkedList<>();
		backtrack(nums, nums.length, l, result);
		System.out.println(result);
	}

}

/*

	47. Permutations II

	decrease time complexity 1000 times than my accepted solution

	public void traverse(List<List<Integer>> resultList, List<Integer> current, int[] nums, boolean[] used) {
		if (current.size() == nums.length)
			resultList.add(new ArrayList<Integer>(current));
		else {
			for (int i = 0; i < nums.length; i++) {
				if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) // remove duplicate
					continue;
				current.add(nums[i]);
				used[i] = true;
				traverse(resultList, current, nums, used);
				used[i] = false;
				current.remove(current.size() - 1);
			}
		}
	}

	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums); // sort is necessary
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		traverse(resultList, new ArrayList<Integer>(), nums, new boolean[nums.length]);
		return resultList;
	}

	or

	public List<List<Integer>> permuteUnique(int[] num) {
	        LinkedList<List<Integer>> res = new LinkedList<>();
	        res.add(new ArrayList<>());
	        for (int i = 0; i < num.length; i++) {
	            Set<String> cache = new HashSet<>();
	            while (res.peekFirst().size() == i) {
	                List<Integer> l = res.removeFirst();
	                for (int j = 0; j <= l.size(); j++) {
	                    List<Integer> newL = new ArrayList<>(l.subList(0,j));
	                    newL.add(num[i]);
	                    newL.addAll(l.subList(j,l.size()));
	                    if (cache.add(newL.toString())) res.add(newL);
	                }
	            }
	        }
	        return res;
	    }
	    
*/
