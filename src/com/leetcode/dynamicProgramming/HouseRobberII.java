package com.leetcode.dynamicProgramming;

public class HouseRobberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 1 };
		System.out.println(houseRobber(nums));

	}

	private static int houseRobber(int[] nums) {
		// TODO Auto-generated method stub
		
		if (nums.length == 1)
			return nums[0];
		
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		
		return Math.max(roblinear(nums, 0, nums.length - 2), roblinear(nums, 1, nums.length - 1));

	}

	private static int roblinear(int[] nums, int start, int end) {
		// TODO Auto-generated method stub

		int dp[] = new int[end - start + 1];

		if (end - start + 1 == 1)
			return dp[0];

		dp[0] = nums[start];
		dp[1] = Math.max(nums[start], nums[start + 1]);

		for (int i = 2; i < end - start + 1; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[start + i]);
		}

		return dp[end - start + 1 - 1];
	}

}
