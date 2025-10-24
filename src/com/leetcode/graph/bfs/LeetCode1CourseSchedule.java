package com.leetcode.graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode1CourseSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] prerequisites = { { 1, 0 }, { 2, 1 }, { 3, 2 }, { 0, 1 } };
		int courses = 4;
		System.out.println(canFinish(courses, prerequisites));

	}

	private static boolean canFinish(int courses, int[][] prerequisites) {
		// TODO Auto-generated method stub
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < courses; i++) {
			graph.add(new ArrayList<>());
		}

		int[] indegree = new int[courses];

		for (int[] pre : prerequisites) {
			int course = pre[0];
			int prereq = pre[1];
			graph.get(prereq).add(course);
			indegree[course]++;
		}

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < courses; i++) {
			if (indegree[i] == 0) {
				queue.offer(i);
			}
		}

		int completed = 0;

		while (!queue.isEmpty()) {
			int curr = queue.poll();
			completed++;

			for (int next : graph.get(curr)) {
				indegree[next]--;
				if (indegree[next] == 0) {
					queue.offer(next);
				}
			}
		}
		return completed == courses;
	}

}
