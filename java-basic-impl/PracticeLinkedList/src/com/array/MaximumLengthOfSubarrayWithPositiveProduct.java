package com.array;

public class MaximumLengthOfSubarrayWithPositiveProduct {

    public static int getMaxLen(int[] nums) {
        int lLp = 0;
        int lLn = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                lLp = lLn = 0;
            } 
            else if (nums[i] > 0) {
                lLp++;
                if (lLn > 0) lLn++;
            } 
            else {
                int temp = lLp;
                lLp = (lLn > 0 ? lLn + 1 : 0);
                lLn = temp + 1;
            }
            max = Math.max(max, lLp);
        }
        return max;
    }
    public static void main(String args[]) {
    	
    }
}
