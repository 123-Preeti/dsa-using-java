package com.backtrack;
import java.util.*;
public class CombinationSum {

	public static void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start) {
		if (target > 0) {
			for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
				cur.add(candidates[i]);
				getResult(result, cur, candidates, target - candidates[i], i);
				cur.remove(cur.size() - 1);
			}
		} else if (target == 0) {
			result.add(new ArrayList<Integer>(cur));
		}
	}


	public static void main(String[] args) {
		int[] candidates = { 3, 2, 6, 7 };
		int target = 7;
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		getResult(result, new ArrayList<Integer>(), candidates, target, 0);

		System.out.println(result);;
	}

}
