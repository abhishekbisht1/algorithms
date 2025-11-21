package com.leetcode.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 6, 7 };
		int target = 7;

		combinationSum(arr, target);

	}

	private static List<List<Integer>> combinationSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		List<List<Integer>> result = new ArrayList<>();
		backtrack(arr, 0, target,  new ArrayList<>(), result);
		return result;
	}

	private static void backtrack(int[] arr, int i, int target, ArrayList arrayList, List<List<Integer>> result) {
		// TODO Auto-generated method stub

	}

}
