package com.leetcode.array;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode7DailyTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temp = { 73, 74, 75, 71, 69, 72, 76, 73 };

		System.out.println(Arrays.toString(nextGreaterTemp(temp)));

	}

	private static int[] nextGreaterTemp(int[] temp) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<>();

		int[] answer = new int[temp.length];

		for (int i = temp.length - 1; i >=
				0; i--) {
			
			while (!stack.isEmpty() && temp[stack.peek()] <= temp[i])
				stack.pop();

			if (!stack.isEmpty())
				answer[i] = stack.peek() - i;
			
			stack.push(i);

		}
		return answer;

	}

}
