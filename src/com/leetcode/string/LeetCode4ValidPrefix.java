package com.leetcode.string;

public class LeetCode4ValidPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words1 = { "flower", "flow", "flight" };
		String[] words2 = { "dog", "racecar", "car" };

		System.out.println(validPrefix(words1));
		System.out.println(validPrefix(words2));

	}

	private static String validPrefix(String[] word) {
		// TODO Auto-generated method stub

		if (word == null || word.length == 0)
			return "";

		String prefix = word[0];

		for (int i = 1; i < word.length; i++) {

			while (word[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty())
					return "No Prefix Available";

			}
		}

		return prefix;
	}

}
