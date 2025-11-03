package com.leetcode.array;

public class LeetCode4MajorityElementBoyerMooreVotingAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));

	}

	private static int majorityElement(int[] nums) {
		// TODO Auto-generated method stub
		int candidate = 0, count = 0;

		for (int num : nums) {
			
			if (count == 0)
				candidate = num;
			
			count += (num == candidate) ? 1 : -1;

		}
		return candidate;

	}
}
