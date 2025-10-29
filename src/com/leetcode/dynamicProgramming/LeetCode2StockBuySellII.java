package com.leetcode.dynamicProgramming;

public class LeetCode2StockBuySellII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 7, 1, 5, 3, 4, 6};
		System.out.println("maxProfit for multiple buying and selling :" + maxProfit(prices));

	}

	private static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub

		if (prices == null || prices.length == 0)
			return 0;

		int profit = 0;

		for (int index = 1; index < prices.length; index++) {

			if (prices[index] > prices[index - 1]) {
                profit += prices[index] - prices[index - 1]; 
            }

		}
		return profit;
	}

}
