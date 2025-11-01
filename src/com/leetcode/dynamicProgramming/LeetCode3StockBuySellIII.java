package com.leetcode.dynamicProgramming;

public class LeetCode3StockBuySellIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };
		System.out.println("Max Profit: " + maxProfit(prices));

	}

	private static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub

		int maxProfit_1 = 0;
		int minPrice = prices[0];

		int left[] = new int[prices.length];
		int right[] = new int[prices.length];

		for (int i = 1; i < prices.length; i++) {

			minPrice = Math.min(minPrice, prices[i]);
			maxProfit_1 = Math.max(maxProfit_1, prices[i] - minPrice);
			left[i] = Math.max(maxProfit_1, left[i - 1]);

		}

		int maxPrice = prices[prices.length - 1];
		int maxProfit_2 = 0;

		for (int i = prices.length - 2; i >= 0; i--) {

			maxPrice = Math.max(maxPrice, prices[i]);
			maxProfit_2 = Math.max(maxProfit_2, maxPrice - prices[i]);
			right[i] = Math.max(maxProfit_2, right[i + 1]);

		}

		int maximumProfit = 0;

		for (int i = 0; i < prices.length - 1; i++) {

			maximumProfit = Math.max(maximumProfit, left[i] + right[i]);
		}

		return maximumProfit;

	}

}
