package com.practice;
import java.util.*;
public class Main
{   
    static List<List<Integer>> res = new ArrayList<>();
    public static int pascalTraingle(int n, int k) {
    	if(k> n)
    		return 0;
    	if(n-k< k)
    		k = n - k;
    	int dp[] = new int[k + 1];
    	dp[0] = 1;
    	int l = (int)Math.pow(10, 9) + 7;
    	for(int i = 1; i<= n; i++) {
    		for(int j = i; j>= 1; j--) {
    			dp[j] = (dp[j] + dp[j - 1]) % l;
    		}
    	}
        return dp[k];
    }
	public static void main(String[] args) {
		System.out.println(pascalTraingle(778, 116));
	}
}
