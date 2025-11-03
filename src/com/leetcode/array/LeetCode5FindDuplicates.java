package com.leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode5FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDuplicates(nums));

	}

	private static List<Integer> findDuplicates(int[] nums) {
		// TODO Auto-generated method stub

		Set<Integer> seen = new HashSet<>();
		List<Integer> duplicates = new ArrayList<>();

		for (int num : nums) {
			if (!seen.add(num))
				duplicates.add(num);

		}

		return duplicates;
	}

}
