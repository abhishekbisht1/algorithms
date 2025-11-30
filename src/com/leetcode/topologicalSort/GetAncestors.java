package com.leetcode.topologicalSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class GetAncestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] edges = { { 0, 3 }, { 0, 4 }, { 1, 3 }, { 2, 4 }, { 2, 7 }, { 3, 5 }, { 3, 6 }, { 3, 7 }, { 4, 6 } };
		int n = 8;

		List<List<Integer>> outPut = getAncestors(edges, n);
		
		System.out.println(outPut.toString());
	}

	private static List<List<Integer>> getAncestors(int[][] edges, int n) {
		// TODO Auto-generated method stub

		List<List<Integer>> adjacencyList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			adjacencyList.add(new ArrayList<>());
		}

		int[] indeg = new int[n];

		for (int[] e : edges) {
			adjacencyList.get(e[0]).add(e[1]);
			indeg[e[1]]++;

		}

		List<Set<Integer>> ancestor = new ArrayList<>();

		for (int a = 0; a < n; a++) {
			ancestor.add(new HashSet<>());
		}

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
        if(indeg[i] == 0 )
			queue.add(i);
		}

		while (!queue.isEmpty()) {

			int u = queue.poll();

			for (int v : adjacencyList.get(u)) {

				ancestor.get(v).add(u);
				ancestor.get(v).addAll(ancestor.get(u));

				if (--indeg[v] == 0)
					queue.add(v);
			}

		}

		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<>(ancestor.get(i));
			Collections.sort(list);
			ans.add(list);

		}
		return ans;

	}

}
