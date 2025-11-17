package com.leetcode.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexicographicPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "BCA";
		List<String> result = permuteLexicographically(str);

		System.out.println(result);

	}

	private static List<String> permuteLexicographically(String str) {
		// TODO Auto-generated method stub

		List<String> result = new ArrayList<>();

		char[] strArray = str.toCharArray();
		Arrays.sort(strArray);

		boolean[] used = new boolean[strArray.length];
		StringBuilder path = new StringBuilder();
		backtrack(strArray, used, path, result);

		return result;
	}

	private static void backtrack(char[] strArray, boolean[] used, StringBuilder path, List<String> result) {
		// TODO Auto-generated method stub

		if (path.length() == strArray.length) {
			result.add(path.toString());
			return;
		}

		for (int i = 0; i < strArray.length; i++) {

			if (used[i] == true)
				continue;

			if (i > 0 && strArray[i - 1] == strArray[i] && !used[i - 1])
				continue;

			used[i] = true;
			path.append(strArray[i]);

			backtrack(strArray, used, path, result);

			used[i] = false;
			path.deleteCharAt(path.length() - 1);

		}

	}

}
