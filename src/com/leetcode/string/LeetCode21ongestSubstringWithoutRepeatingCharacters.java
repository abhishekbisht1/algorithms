package com.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class LeetCode21ongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcbb";

		System.out.println("Longest substring length: " + lengthOfLongestSubstring(str));

	}

	private static int lengthOfLongestSubstring(String str) {
		// TODO Auto-generated method stub

		Set<Character> set = new HashSet<>();
		int left = 0;
		int maxLen = 0;

		for (int right = 0; right < str.length(); right++) {

			while (set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}

			set.add(str.charAt(right));

			maxLen = Math.max(maxLen, right - left + 1);

		}
		return maxLen;

	}
}