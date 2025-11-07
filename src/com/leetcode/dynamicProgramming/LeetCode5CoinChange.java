package com.leetcode.dynamicProgramming;

import java.util.Arrays;

public class LeetCode5CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coins = { 1,2,5 };
		int amount = 11;

		System.out.println(coinChange(coins, amount));

	}

	private static int coinChange(int[] coins, int amount) {
		// TODO Auto-generated method stub

		int[] dp = new int[amount + 1];

		Arrays.fill(dp, amount + 1);

		dp[0] = 0;

		for (int i = 1; i <= amount; i++) {
			for (int coin : coins) {
				if (coin <= i) {
					dp[i] =  Math.min(dp[i], dp[i - coin] + 1);
				}
			}
		}

		return dp[amount] > amount ? -1 : dp[amount];

	}

}
