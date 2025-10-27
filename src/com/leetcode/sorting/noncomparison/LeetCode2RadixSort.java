package com.leetcode.sorting.noncomparison;

public class LeetCode2RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };
		radixSort(arr);
		
		System.out.println("Radix Sort : ");
		
		for (int num : arr) {
			System.out.println(num + " ");
		}

	}

	private static void radixSort(int[] arr) {
		// TODO Auto-generated method stub

		int max = getMax(arr);

		for (int exp = 1; max / exp > 0; exp *= 10) {
			countingSort(arr, exp);
		}

	}

	private static void countingSort(int[] arr, int exp) {
		// TODO Auto-generated method stub

		int n = arr.length;
		int[] freqArray = new int[10];

		for (int i = 0; i < arr.length; i++) {
			freqArray[arr[i] / exp]++;
		}

		for (int i = 1; i < 10; i++) {
			freqArray[i]++;
		}

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
