package com.leetcode.topologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ParallelCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] relations = { { 1, 3 }, { 2, 3 } };
		int n = 3;

		System.out.println(minimumSemesters(n, relations));

	}

	private static int minimumSemesters(int n, int[][] relations) {
		// TODO Auto-generated method stub

		List<List<Integer>> graph = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}

		int[] indegree = new int[n + 1];

		for (int[] r : relations) {
			graph.get(r[0]).add(r[1]);
			indegree[r[1]]++;
		}

		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			if (indegree[i] == 0)
				queue.add(i);
		}

		int semester = 0;
		int completed = 0;

		while (!queue.isEmpty()) {
			int size = queue.size();
			semester++;

			while (size-- > 0) {
				int u = queue.poll();
				completed++;

				for (int v : graph.get(u)) {
					if (--indegree[v] == 0)
						queue.add(v);
				}

			}
		}
		return completed == n ? semester : -1;
	}

}
