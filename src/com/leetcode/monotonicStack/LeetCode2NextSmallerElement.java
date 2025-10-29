package com.leetcode.monotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode2NextSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 5, 3, 4 };

		int result[] = nextSmallerElement(arr, arr.length);

		System.out.println("Printing Next Greater Element");

		/*
		 * for (int num : result) { System.out.println(" " + num); ; }
		 */

		System.out.println(Arrays.toString(result));

	}

	private static int[] nextSmallerElement(int[] arr, int n) {
		// TODO Auto-generated method stub

		int result[] = new int[n];
		
		Stack<Integer> stack = new Stack<>();

		for (int i = n - 1; i >= 0; i--) {

			while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}

			result[i] = stack.isEmpty() ? -1 : arr[stack.peek()];

			stack.push(i);

		}

		return result;



	}

}
