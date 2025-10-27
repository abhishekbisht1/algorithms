package com.leetcode.sorting.noncomparison;

public class LeetCode2RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };

		radixSort(arr);
		System.out.println("RAdix Sort : ");
		for (int num : arr) {
          System.out.println(num + " ");
		}

	}

	private static void radixSort(int[] arr) {
		// TODO Auto-generated method stub

		int max = getMax(arr);
		
		for(int i = 1; max/i > 0 ; i *=  10 ) {
			countingSort(arr, i);
		}

	}

	private static void countingSort(int[] arr, int i) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		
		int []freqArray = new int[n];
		
		
		
		

	}

	private static int getMax(int[] arr) {
		// TODO Auto-generated method stub

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		return max;
	}

}
