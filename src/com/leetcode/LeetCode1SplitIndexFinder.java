package com.leetcode;

import java.util.stream.IntStream;

public class LeetCode1SplitIndexFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 1, 4, 3, 6, 8, 10, 7, 9 };
		
		int[] prefixMax = new int[arr.length];
		int[] suffixMin = new int[arr.length];
		
		System.out.println(indexFinder(arr,prefixMax,suffixMin));
		
	}

	private static int indexFinder(int[] arr, int[] prefixMax, int[] suffixMin) {
		// TODO Auto-generated method stub
		int n = arr.length;

		prefixMax[0] = Integer.MIN_VALUE;

		IntStream.range(1, n)
        .forEach(i -> {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i - 1]);
            System.out.println(i + "," + prefixMax[i]);
        });

		suffixMin[n-1] = Integer.MAX_VALUE;

		IntStream.iterate(n - 2, i -> i >= 0, i -> i - 1).forEach(i -> {
            suffixMin[i] = Math.min(suffixMin[i + 1], arr[i + 1]);
            System.out.println(i + "," + suffixMin[i]);
        });
		

		
		return IntStream.range(1, n-1)
        .filter(i -> prefixMax[i] < suffixMin[i]).findFirst().orElse(-1);
		
	}

}
