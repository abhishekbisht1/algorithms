package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode11TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] arg = twoSum(nums, target);

		for (int num : arg) {
			System.out.println(num);

		}

	}

	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> twoSum = new HashMap<>();

		int i = 0;
		for (int num : nums) {

			if (twoSum.containsKey(target - num)) {
				return new int[] { i, twoSum.get(target - num) };
			} else {
				twoSum.put(num, i);
				i++;

			}

		}

		return new int[] { 0, 0 };

	}
}
