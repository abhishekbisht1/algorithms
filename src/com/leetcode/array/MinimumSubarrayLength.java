package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class MinimumSubarrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 2, 3, 1 };
		System.out.println(minimumSubarrayLength(nums, 4));

	}

	public static int minimumSubarrayLength(int[] nums, int k) {
		Map<Integer, Integer> freq = new HashMap<>();
		long distinctSum = 0;
		int left = 0;
		int ans = Integer.MAX_VALUE;

		for (int right = 0; right < nums.length; right++) {
			int val = nums[right];
			freq.put(val, freq.getOrDefault(val, 0) + 1);

			// first occurrence
			if (freq.get(val) == 1) {
				distinctSum += val;
			}
			// shrink while valid
			while (distinctSum >= k) {
				ans = Math.min(ans, right - left + 1);

				int leftVal = nums[left++];
				freq.put(leftVal, freq.get(leftVal) - 1);

				if (freq.get(leftVal) == 0) {
					distinctSum -= leftVal;
				}
			}
		}

		return ans == Integer.MAX_VALUE ? -1 : ans;
	}

}
