package com.leetcode.dynamicProgramming;

public class LeetCode1StockBuySellI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		System.out.println("maxProfit :" + maxProfit(prices));

	}

	private static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub

		if (prices.length == 0 || prices == null)
			return 0;
		int minPrice = prices[0];
		int maxProfit = 0;

		for (int index = 1; index < prices.length; index++) {

			if (minPrice > prices[index]) {
				minPrice = prices[index];

			} else {
				maxProfit = Math.max(maxProfit, prices[index] - minPrice);

			}

		}
		
		return maxProfit;

	}

}
