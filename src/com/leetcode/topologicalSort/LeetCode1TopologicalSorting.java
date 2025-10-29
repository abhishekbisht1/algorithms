package com.leetcode.topologicalSort;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class LeetCode1TopologicalSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "wrt", "wrf", "er", "ett", "rftt" };
		System.out.println("Alien Dictionary Order: " + alienOrder(words));

	}

	private static String alienOrder(String[] words) {
		// TODO Auto-generated method stub

		Map<Character, Set<Character>> graph = new HashMap<>();
		Map<Character, Integer> indegree = new HashMap<>();

		for (String word : words) {
			for (char c : word.toCharArray()) {
				graph.putIfAbsent(c, new HashSet<>());
				indegree.putIfAbsent(c, 0);
			}
		}

		for (int i = 0; i < words.length -1; i++) {

			String w1 = words[i], w2 = words[i + 1];
			
			if (w1.length() > w2.length() && w1.startsWith(w2))
				return "";

			int len = Math.min(w1.length(), w2.length());

			for (int j = 0; j < len; j++) {
				char c1 = w1.charAt(j), c2 = w2.charAt(j);
				if(c1!=c2) {
				if (!graph.get(c1).contains(c2)) {
					graph.get(c1).add(c2);
					indegree.put(c2, indegree.get(c2) + 1);
				}
				break;
				}
			}

		}

		Queue<Character> queue = new LinkedList<>();

		for (char c : indegree.keySet()) {
			if (indegree.get(c) == 0) {
				queue.add(c);
			}
		}

		StringBuilder sb = new StringBuilder();

		while (!queue.isEmpty()) {
			char c = queue.poll();
			sb.append(c);

			for (char next : graph.get(c)) {
				indegree.put(next, indegree.get(next) - 1);
				if (indegree.get(next) == 0)
					queue.add(next);
			}

		}

		if (sb.length() < graph.size()) return "";
		return sb.toString();
	}

}
