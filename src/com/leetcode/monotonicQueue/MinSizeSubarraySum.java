package com.leetcode.monotonicQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MinSizeSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 84, -37, 32, 40, 95 };
		int target = 167;

		System.out.println(shortestSubarray(arr, target));

	}

	private static int shortestSubarray(int[] arr, int target) {
		// TODO Auto-generated method stub

		long[] prefix = new long[arr.length + 1];

		int i = 0;

		for (int n : arr) {
			prefix[i + 1] = prefix[i] + n;
			i++;
		}

		Deque<Integer> dq = new ArrayDeque<>();
		int ans = Integer.MAX_VALUE;

		for (int j = 0; j < prefix.length; j++) {

			while (!dq.isEmpty() && prefix[j] - prefix[dq.peekFirst()] >= target) {
				ans = Math.min(ans, i - dq.pollFirst());
			}

			while (!dq.isEmpty() && prefix[j] <= prefix[dq.peekLast()]) {
				dq.pollLast();

			}
			dq.offerLast(j);
		}

		return ans == Integer.MAX_VALUE ? -1 : ans;

	}

}
