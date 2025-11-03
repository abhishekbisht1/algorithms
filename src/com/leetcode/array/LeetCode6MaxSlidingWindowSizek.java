package com.leetcode.array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LeetCode6MaxSlidingWindowSizek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;

		// System.out.println(maxSlidingWindowSizek(nums, k));

		System.out.println(Arrays.toString(maxSlidingWindowSizek(nums, k)));

	}

	private static int[] maxSlidingWindowSizek(int[] nums, int k) {
		// TODO Auto-generated method stub

		if (nums == null || nums.length == 0)
			return new int[0];

		int n = nums.length;
		int[] result = new int[n - k + 1];

		Deque<Integer> deque = new ArrayDeque<Integer>();

		for (int i = 0; i < n; i++) {

			if (!deque.isEmpty() && deque.peekFirst() < i - k)
				deque.pollFirst();

			while (!deque.isEmpty() && nums[deque.peekFirst()] < nums[i])
				deque.pollLast();

			deque.offerLast(i);

			if (i >= k - 1)
				result[i - k + 1] = nums[deque.peekFirst()];

		}
		return result;
	}

}
