package com.leetcode.array;

import java.util.Stack;

public class LeetCode13OceanView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] heights = { 4, 3, 2, 1 };

		System.out.println(findBuildings(heights));

	}

	private static int[] findBuildings(int[] heights) {
		// TODO Auto-generated method stub

		if (heights == null || heights.length == 0)
			return new int[0];

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < heights.length; i++) {

			while (!stack.isEmpty() && heights[i] >= heights[stack.peek()]) {
				stack.pop();
			}
			stack.push(i);

		}

		// System.out.println(stack);
		int[] result = new int[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
			result[i] = stack.get(i);

		}

		return result;

	}

}
