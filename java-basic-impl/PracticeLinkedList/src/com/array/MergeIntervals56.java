package com.array;

import java.util.Arrays;
import java.util.LinkedList;

//							Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//							Output: [[1,6],[8,10],[15,18]]
public class MergeIntervals56 {
	public static int[][] merge(int[][] intervals) {
		if (intervals == null || intervals.length == 0)
			return intervals;
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		LinkedList<int[]> mergedIntervals = new LinkedList<>();
		for (int[] curr : intervals) {
			if (mergedIntervals.isEmpty() || mergedIntervals.getLast()[1] < curr[0])
				mergedIntervals.add(curr);
			else
				mergedIntervals.getLast()[1] = Math.max(mergedIntervals.getLast()[1], curr[1]);
		}

		return mergedIntervals.toArray(new int[0][]);
	}
}
