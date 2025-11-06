package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode10minWindow {

	public static void main(String[] args) {

		String source = "ADOBECODEBANC", target = "ABC";

		System.out.println(minWindow(source, target));

	}

	private static String minWindow(String source, String target) {
		// TODO Auto-generated method stub

		if (target.length() == 0 || source.length() < target.length())
			return "";

		Map<Character, Integer> map_target = new HashMap<>();
		Map<Character, Integer> map_source = new HashMap<>();

		for (char c : target.toCharArray()) {
			map_target.put(c, map_target.getOrDefault(c, 0) + 1);
		}

		int left = 0, right = 0;

		int required = map_target.size();
		int formed = 0;
		int maxLen = Integer.MAX_VALUE;
		int leftCursor = 0;

		while (right < source.length()) {

			char c = source.charAt(right);
			map_source.put(c, map_source.getOrDefault(c, 0) + 1);

			if (map_target.containsKey(c) && map_source.get(c).intValue() == map_target.get(c).intValue()) {
				formed++;
			}

			while (left <= right && formed == required) {

				if (right - left + 1 < maxLen) {
					maxLen = right - left + 1;
					leftCursor = left;
				}

				char cl = source.charAt(left);

				map_source.put(cl, map_source.get(cl) - 1);

				if (map_target.containsKey(cl) && map_source.get(cl) < map_target.get(cl)) {
					formed--;
				}

				left++;
			}
			right++;
		}
		return maxLen == Integer.MAX_VALUE ? "" : source.substring(leftCursor, leftCursor + maxLen);

	}
	
	 /* public static String minWindow(String s, String t) {
	        if (t.length() == 0 || s.length() < t.length()) return "";

	        Map<Character, Integer> need = new HashMap<>();
	        for (char c : t.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);

	        int required = need.size();
	        int formed = 0;
	        Map<Character, Integer> have = new HashMap<>();

	        int left = 0, right = 0;
	        int bestLen = Integer.MAX_VALUE, bestL = 0;

	        while (right < s.length()) {
	            char c = s.charAt(right);
	            have.put(c, have.getOrDefault(c, 0) + 1);
	            if (need.containsKey(c) && have.get(c).intValue() == need.get(c).intValue()) {
	                formed++;
	            }

	            while (left <= right && formed == required) {
	                // Update best
	                if (right - left + 1 < bestLen) {
	                    bestLen = right - left + 1;
	                    bestL = left;
	                }

	                char cl = s.charAt(left);
	                have.put(cl, have.get(cl) - 1);
	                if (need.containsKey(cl) && have.get(cl) < need.get(cl)) {
	                    formed--;
	                }
	                left++;
	            }
	            right++;
	        }
	        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestL, bestL + bestLen);
	    }*/
}
