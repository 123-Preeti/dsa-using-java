package com.dp;

public class MinJumpsToReachTillEnd {

	public static int minJumpsToReachTillEnd(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}

		int[] minJumps = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			minJumps[i] = Integer.MAX_VALUE;
		}

		minJumps[0] = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j <= i + arr[i] && j < arr.length; j++) {
				minJumps[j] = Math.min(minJumps[j], 1 + minJumps[i]);
			}
		}

		return minJumps[arr.length - 1];
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 0, 2, 1, 2, 1 };

		System.out.println(MinJumpsToReachTillEnd.minJumpsToReachTillEnd(arr));
	}
}






//			boolean jump[] = new boolean[nums.length];
//			jump[0] = true;
//			for(int i = 0; i< nums.length - 1; i++){
//			    int j = 0;
//			    for(j = i; j<=  i  + nums[i] && j< nums.length; j++) {
//			        jump[j] = true;
//			    }
//			    if(nums[i] == 0) {
//			            if(!(jump[j]))
//			                break;
//			        }
//			}
//			return jump[nums.length - 1];








//			int sc = 0;
//			int j = 0;
//			int max = 0;
//			for(int i=0; i<nums.length-1; i++) {
//			    max = Math.max(max, i+nums[i]);
//			    if( i == j ) {
//			        sc++;
//			        j = max;
//			    } 
//			}