package com.leetcode;

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

		for (int i = 1; i <= n - 1; i++) {
			prefixMax[i] = Math.max(prefixMax[i - 1], arr[i - 1]);
			System.out.println(i + "," + prefixMax[i]);
		}

		suffixMin[n-1] = Integer.MAX_VALUE;

		for (int i = n - 2; i >= 0; i--) {
			suffixMin[i] = Math.min(suffixMin[i + 1], arr[i + 1]);
			System.out.println(i + "," + suffixMin[i]);

		}
		
		for(int i =1 ; i<n-1; i++) {
			if (prefixMax[i] < suffixMin[i])
				return i;
			
		}
		
		return -1;
		
	}

}
