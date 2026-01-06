package com.leetcode.circular;

public class EliminationGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(lastRemaining(arr));

	}

	private static int lastRemaining(int[] arr) {
		// TODO Auto-generated method stub

		int head = 1;
		int step = 1;
		int remaining = arr.length;
		boolean left = true;

		while (remaining > 1) {

			if (left || remaining % 2 == 1) {
				head += step;
			}

			remaining /= 2;
			step *= 2;
			left = !left;

		}

		return head;

	}

}
