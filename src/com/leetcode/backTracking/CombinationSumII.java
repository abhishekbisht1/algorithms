package com.leetcode.backTracking;

import java.util.*;

public class CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CombinationSumII cs = new CombinationSumII();
		List<List<Integer>> res = cs.combinationSum(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8);

		for (List<Integer> output : res) {
			System.out.println(output);
		}
	}

	private List<List<Integer>> combinationSum(int[] array, int target) {
		// TODO Auto-generated method stub

		Arrays.sort(array);
		List<List<Integer>> result = new ArrayList<>();
		backtrack(0, new ArrayList<>(), array, target, result);
		return result;

	}

	private void backtrack(int start, List<Integer> path, int[] array, int target, List<List<Integer>> result) {
		// TODO Auto-generated method stub

		if (target == 0) {
			result.add(new ArrayList<Integer>(path));
			return;
		}

		for (int i = start; i < array.length; i++) {

			if (i > start && array[i] == array[i - 1])
				continue;

			if (array[i] > target)
				break;

			path.add(array[i]);

			backtrack(i + 1, path, array, target - array[i], result);

			path.remove(path.size() - 1);

		}

	}

}
