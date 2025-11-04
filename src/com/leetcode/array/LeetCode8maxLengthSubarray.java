package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode8maxLengthSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 5, -2, 3, -3, 4, 5 };
		int k = 3; 

		System.out.println(maxLengthSubArray(nums, k));

	}

	private static int maxLengthSubArray(int[] nums, int k) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<>();

		int sum = 0, maxLen = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			sum += nums[i];
			if (sum == k)
				maxLen = i + 1;

			if (map.containsKey(sum - k)) {
				maxLen = Math.max(maxLen, i - map.get(sum - k));
			}

			map.putIfAbsent(sum, i);
		}

		return maxLen;
	}

}
