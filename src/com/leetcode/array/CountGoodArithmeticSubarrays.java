package com.leetcode.array;

public class CountGoodArithmeticSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 3, 4, 5, 7, 6, 5 };
		System.out.println(countGoodArithmeticSubarrays(nums));

	}

	private static int countGoodArithmeticSubarrays(int[] nums) {
		// TODO Auto-generated method stub

		if (nums.length < 2)
			return 0;

		int prevDiff = nums[1] - nums[0];

		int count = 0;
		int lengthOfSubarrays = 1;

		for (int i = 1; i < nums.length; i++) {
			int diff = nums[i] - nums[i - 1];

			if (Math.abs(diff) == 1)
				lengthOfSubarrays++;
			else {
				if (Math.abs(prevDiff) == 1)
					count += (lengthOfSubarrays * (lengthOfSubarrays - 1)) / 2;
				lengthOfSubarrays = 1;

			}

			prevDiff = diff;

		}

		if (Math.abs(prevDiff) == 1)
			count += (lengthOfSubarrays * (lengthOfSubarrays - 1)) / 2;

		return count;
	}
}
