package com.leetcode.array;

public class minSizeSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = { 2, 3, 1, 2, 4, 3 };
		int[] arr = {84,-37,32,40,95};
		int target = 167;

		System.out.println(minSizeSubarraySum(arr, target));

	}

	private static int minSizeSubarraySum(int[] arr, int target) {
		// TODO Auto-generated method stub

		int left = 0, minSizedWindowSum = 0;
		int res = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			minSizedWindowSum += arr[i];

			while (minSizedWindowSum >= target) {
				res = Math.min(res, i - left + 1);
				minSizedWindowSum -= arr[left++];
			}

		}
		return res;
	}

}
