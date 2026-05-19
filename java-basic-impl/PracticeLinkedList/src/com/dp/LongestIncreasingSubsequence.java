package com.dp;

public class LongestIncreasingSubsequence {
	public static int lisLength(int[] a) {
	    int[] lis = new int[a.length];

	    for (int i = 0; i < lis.length; i++) {
	      lis[i] = 1;
	    }

	    int maxLisLength = 1;

	    for (int i = 1; i < lis.length; i++) {
	      for (int j = 0; j < i; j++) {
	        if (a[i] > a[j] && 1 + lis[j] > lis[i]) {
	          lis[i] = lis[j] + 1;

	          maxLisLength = Math.max(maxLisLength, lis[i]);
	        }
	      }
	    }

	    return maxLisLength;
	  }

	  public static void main(String[] args) {

	    int a[] = { 7, 1, 4, 8, 11, 2, 14, 3 };

	    System.out.println(LongestIncreasingSubsequence.lisLength(a));

	  }
}


//		public int lengthOfLIS(int[] nums) {
//		    int[] tails = new int[nums.length];
//		       int size = 0;
//		       for (int x : nums) {
//		           int i = 0, j = size;
//		           while (i != j) {
//		               int m = (i + j) / 2;
//		               if (tails[m] < x)
//		                   i = m + 1;
//		               else
//		                   j = m;
//		           }
//		           tails[i] = x;
//		           if (i == size) ++size;
//		       }
//		       return size;
//		}
