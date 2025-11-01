package com.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode5Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(words));

	}

	private static List<List<String>> groupAnagrams(String[] words) {
		// TODO Auto-generated method stub

		if (words == null || words.length == 0)
			return null;

		Map<String, List<String>> map = new HashMap<>();

		for (String str : words) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);

			map.computeIfAbsent(key, _-> new ArrayList<>()).add(str);
		}

		return new ArrayList<>(map.values());

	}

}
