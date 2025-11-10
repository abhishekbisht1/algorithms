package com.leetcode.array;

public class LeetCode12MinimumJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 3, 1, 1, 4 };

		System.out.println(jumpFrog(nums));

	}

	private static boolean jumpFrog(int[] nums) {
		// TODO Auto-generated method stub
		int maxReach = 0;

		for (int i = 0; i < nums.length; i++) {

			if (i > maxReach)
				return false;

			maxReach = Math.max(maxReach, i + nums[i]);

			if (maxReach > nums.length)
				return true;

		}
		return true;

	}

}
