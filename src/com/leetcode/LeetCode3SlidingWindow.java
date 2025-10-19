package com.leetcode;

import java.util.stream.IntStream;

public class LeetCode3SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		System.out.println(SumKArray(arr, k));

	}

	private static int SumKArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		return IntStream.range(0, arr.length - k + 1)
				.map(i -> IntStream.range (i, i + k)
				.map(j -> arr[j]).sum()).max().orElse(0);



	}
	
}
