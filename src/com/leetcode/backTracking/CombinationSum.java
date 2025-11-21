package com.leetcode.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {8, 7, 4, 3};
		int target = 11;

		CombinationSum combSum = new CombinationSum();
		Arrays.sort(array);
		List<List<Integer>> result =  combSum.combinationSum(array, target);
		
		for(List<Integer> res : result)
			System.out.println(res);

	}

	private List<List<Integer>> combinationSum(int[] array, int target) {
		// TODO Auto-generated method stub

		List<List<Integer>> result = new ArrayList<>();
		backtrack(0, target, new ArrayList<>(), array, result);

		return result;

	}

	private void backtrack(int start, int target, List<Integer> path, int[] array, List<List<Integer>> result) {
		// TODO Auto-generated method stub

		if(target == 0) {
			result.add(new ArrayList<>(path));
			return;
		}
		
		for (int i = start; i < array.length; i++) {

			if (array[i] > target)
				break;
			
			path.add(array[i]);

			backtrack(i, target - array[i], path, array, result);

			path.remove(path.size() - 1);

		}
	}

}
