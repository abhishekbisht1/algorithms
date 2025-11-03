package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));

	}

	private static int majorityElement(int[] nums) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> freqMap = new HashMap<>();
		int n = nums.length;

		for (int num : nums) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

			if (freqMap.get(num) > n/2)
				return num;
		}
		return -1;
	}

}
