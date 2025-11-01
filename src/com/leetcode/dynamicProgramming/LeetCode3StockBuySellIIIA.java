package com.leetcode.dynamicProgramming;

public class LeetCode3StockBuySellIIIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };

		int[] prices = { 3, 2, 6, 5, 0, 3 };

		int k = 3;

		System.out.println("Max Profit: " + maxProfit(prices, k));

	}

	private static int maxProfit(int[] prices, int k) {
		// TODO Auto-generated method stub

		int len = prices.length;
		int[][] dp = new int[k + 1][len];

		for (int i = 1; i <= k; i++) {
			int effectiveBuy = prices[0];

			for (int j = 1; j < len; j++) {
				dp[i][j] = Math.max(dp[i][j - 1], prices[j] - effectiveBuy);
				effectiveBuy = Math.min(effectiveBuy, prices[j] - dp[i - 1][j]);

			}

		}
		return dp[k][len - 1];
	}

}
