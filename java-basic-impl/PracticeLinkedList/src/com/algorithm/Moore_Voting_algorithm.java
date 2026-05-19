package com.algorithm;

//169. Majority Element
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than n / 2 times. 
//You may assume that the majority element always exists in the array.

public class Moore_Voting_algorithm {
	public int majorityElement(int[] nums) {
		int count = 0, ret = 0;
		for (int num : nums) {
			if (count == 0)
				ret = num;
			if (num != ret)
				count--;
			else
				count++;
		}
		return ret;
	}


}
//or

//Arrays.sort(nums);
//return nums[nums.length/2];

//Bit Manipulation
//int[] bit = new int[32];
//for (int num: nums)
//for (int i=0; i<32; i++) 
//   if ((num>>(31-i) & 1) == 1)
//       bit[i]++;
//int ret=0;
//for (int i=0; i<32; i++) {
//bit[i]=bit[i]>nums.length/2?1:0;
//ret += bit[i]*(1<<(31-i));
//}
//return ret;

