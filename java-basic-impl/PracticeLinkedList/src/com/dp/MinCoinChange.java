package com.dp;

public class MinCoinChange {

	public static int minCoinsToMakeSum(int[] coins, int sum) {
		if (coins.length == 0 || sum <= 0) {
			return 0;
		}

		int numberOfCoins = coins.length;

		int[][] arr = new int[numberOfCoins][sum + 1];

		for (int i = 0; i < numberOfCoins; i++) {
			arr[i][0] = 0;
		}

		for (int i = 0; i < numberOfCoins; i++) {
			for (int j = 1; j <= sum; j++) {

				int includingCurrentCoin = Integer.MAX_VALUE;
				int excludingCurrentCoin = Integer.MAX_VALUE;

				if (coins[i] <= j) {
					includingCurrentCoin = 1 + arr[i][j - coins[i]];
				}

				if (i > 0) {
					excludingCurrentCoin = arr[i - 1][j];
				}

				arr[i][j] = Math.min(includingCurrentCoin, excludingCurrentCoin);
			}
		}

		return arr[numberOfCoins - 1][sum];
	}

	public static void main(String[] args) {

		int[] coins = { 4, 6, 3 };

		int sum = 5;

		System.out.println(MinCoinChange.minCoinsToMakeSum(coins, sum));

	}

}

//		above solution not work
//		int[] dp=new int[amount+1];
//		Arrays.fill(dp,amount+1);
//		dp[0]=0;
//		for(int i=1;i<=amount;i++)
//		    for(int c:coins)
//		        if(i>=c) dp[i]=Math.min(dp[i],dp[i-c]+1);
//		return dp[amount]>amount?-1:dp[amount];
