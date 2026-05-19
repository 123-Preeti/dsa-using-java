package com.notes;

import java.util.Arrays;
import java.util.Comparator;

/* 179. Largest Number
 * 	Input: nums = [10,2]
	Output: "210"
 * Given a list of non-negative integers nums, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer */


public class StringComparator {
        public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = nums[i]+"";
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                String s1 = i+j;
                String s2 = j+i;
                return s1.compareTo(s2);
            }
        });
        if (strs[strs.length-1].charAt(0) == '0') return "0";
        String res = new String();
        for (int i = 0; i < strs.length; i++) {
            res = strs[i]+res;
        }
        return res;
    } 
}
