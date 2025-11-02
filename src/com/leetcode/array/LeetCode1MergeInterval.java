package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1MergeInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] intervals = { { 2, 6 }, { 15, 18 }, { 8, 10 }, { 1, 3 } };

		int arr[][] = mergeInterval(intervals);

		System.out.println("Merged Intervals :");

		for (int[] interval : arr) {
			System.out.println(Arrays.toString(interval));
		}

	}

	private static int[][] mergeInterval(int[][] intervals) {
		// TODO Auto-generated method stub

		// for (int[] interval : intervals)
		// System.out.println(interval[0] + "," + interval[1]);

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		// for (int[] interval : intervals)
		// System.out.println(interval[0] + "," + interval[1]);

		List<int[]> result = new ArrayList<>();

		// System.out.println("list result :" + result.get(0)[1]);

		for (int[] interval : intervals) {

			if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
				result.add(interval);
			} else {
				result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
			}

		}

		return result.toArray(new int[result.size()][]);
	}

}
