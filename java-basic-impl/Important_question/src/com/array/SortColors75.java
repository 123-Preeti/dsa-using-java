package com.array;

public class SortColors75 {
//			Input: nums = [2,0,2,1,1,0]
//			Output: [0,0,1,1,2,2]

	// 1-pass
	public void sortColors1(int[] nums) {
		int i1 = 0, i2 = nums.length - 1, i = 0;
		while (i <= i2) {
			if (nums[i] == 0) {
				nums[i] = nums[i1];
				nums[i1] = 0;
				i1++;
			}
			if (nums[i] == 2) {
				nums[i] = nums[i2];
				nums[i2] = 2;
				i2--;
				i--;
			}
			i++;
		}
	}

	// 2-pass
	public void sortColors2(int[] nums) {

		int count0 = 0, count1 = 0, count2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count0++;
			}
			if (nums[i] == 1) {
				count1++;
			}
			if (nums[i] == 2) {
				count2++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (i < count0) {
				nums[i] = 0;
			} else if (i < count0 + count1) {
				nums[i] = 1;
			} else {
				nums[i] = 2;
			}
		}
	}

}
