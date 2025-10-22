package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode4LongestConsecutiveSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 100, 4, 200, 1, 3, 2 };
		System.out.println(LongestConsecutiveSeq(arr));

	}

	private static int LongestConsecutiveSeq(int[] arr) {
		// TODO Auto-generated method stub
		if (arr.length == 0)
			return 0;

		Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());

		return set.stream().filter(n -> !set.contains(n - 1))
			.mapToInt(n -> {
			int curr = n;
			int length = 1;
			while (set.contains(curr + 1)) {
				curr++;
				length++;
			}
			return length;
		}).max().orElse(0);

		// int longest = 0;

		/*
		 * for (int n : set) {
		 * 
		 * if(!set.contains(n-1)) { int curr = n; int streak = 1;
		 * while(set.contains(curr+1)) { curr++; streak++;
		 * 
		 * } longest = Math.max(longest, streak); }
		 * 
		 * } return longest;
		 */
	}

}
