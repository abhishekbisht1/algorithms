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
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c: source.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		
		
		
			
		return target;
		
		
		
	}
}
