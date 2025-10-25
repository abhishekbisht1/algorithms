package com.leetcode.graph.dfs;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1CourseSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] prerequisite =  {{1,0},{1,2},{3,1}};
		int numCourse = 4;
		System.out.println(canFinish(prerequisite, numCourse));

	}

	private static boolean canFinish(int[][] prerequisite, int numCourse) {
		// TODO Auto-generated method stub
		List<List<Integer>> graph = new ArrayList<>();
		for(int i=0; i< numCourse; i++)
		  graph.add(new ArrayList<>());
		
		for(int[] pre : prerequisite ) {
			graph.get(pre[1]).add(pre[0]);
		}
		
		int[] state = new int[numCourse];
		
		for(int i=0; i < numCourse; i++) {
			if (state[i] == 0 && !dfs(graph ,state ,i ))
				return false;
		}
		
		return true;
	}

	private static boolean dfs(List<List<Integer>> graph, int[] state, int course) {
		// TODO Auto-generated method stub
		state[course] = 1;
		
		for(int next: graph.get(course)) {
			if (state[next] == 1) return false;
			if ((state[next] == 0) && !dfs(graph, state, next))  return false;
		}
		
		state[course] = 2;
		return true;
	}

}
