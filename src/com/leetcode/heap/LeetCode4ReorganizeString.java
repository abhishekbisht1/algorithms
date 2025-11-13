package com.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class LeetCode4ReorganizeString {

	public static void main(String args[]) {
		String str = "aab";
		System.out.println(reorganizeString(str));
	}

	private static String reorganizeString(String str) {
		// TODO Auto-generated method stub

		Map<Character, Integer> frequencyMap = new HashMap<>();

		for (char c : str.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}

		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
				(a, b) -> b.getValue() - a.getValue());
		maxHeap.addAll(frequencyMap.entrySet());

		StringBuilder result = new StringBuilder();
		Map.Entry<Character, Integer> prev = null;

		while (!maxHeap.isEmpty()) {

			Map.Entry<Character, Integer> current = maxHeap.poll();
			result.append(current.getKey());
			current.setValue(current.getValue() - 1);

			if (prev != null && prev.getValue() > 0)
				maxHeap.offer(prev);

			prev = current;
		}

		for (int i = 1; i < result.length(); i++) {
			if (result.charAt(i) == result.charAt(i - 1)) {
				return "";
			}
		}

		return result.toString();
	}

}
