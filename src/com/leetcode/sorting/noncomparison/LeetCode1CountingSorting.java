package com.leetcode.sorting.noncomparison;

public class LeetCode1CountingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 1, 3, 2, 4, 6, 5, 8, 2, 5 };

		 countingSort(arr);
		System.out.println(" Counting Sorting: :" + arr);

		for (int num : arr) {
			System.out.println(num);
		}

	}

	private static int[] countingSort(int[] arr) {
		// TODO Auto-generated method stub

		int max = getMax(arr);
		int freqArray[] = new int[max + 1];

		for (int num : arr) {
			freqArray[num]++;
		}

		int index = 0;
		for (int i = 0; i <= max; i++) {
			while (freqArray[i] > 0) {
				arr[index++] = i;
				freqArray[i]--;
			}
		}
		return arr;

	}

	private static int getMax(int[] arr) {
		// TODO Auto-generated method stub

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		return max;
	}

}
