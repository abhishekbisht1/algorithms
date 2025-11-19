package com.leetcode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aab";
		partitioningPalindrome(str);

	}

	private static List<List<String>> partitioningPalindrome(String str) {
		// TODO Auto-generated method stub

		List<List<String>> result = new ArrayList<>();
		backtrack(str, 0, new ArrayList<>(), result);
		return result;

	}

	private static void backtrack(String str, int start, ArrayList path, List<List<String>> result) {
		// TODO Auto-generated method stub

		if(start == ) {
			
		}
		
		for (int end = start; end < str.length(); end++) {
			if (isPalindrome(str, start, end)) {
				path.add(str.substring(start, end + 1));
				backtrack(str, end + 1, path, result);
				path.remove();
			}
		}
	}

	private static boolean isPalindrome(String str, int left, int right) {
		// TODO Auto-generated method stub
		while (left < right) {
			if (str.charAt(left++) != str.charAt(right--))
				return false;
		}
		return false;
	}

}
