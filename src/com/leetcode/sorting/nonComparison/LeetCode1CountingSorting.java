package com.leetcode.sorting.nonComparison;

public class LeetCode1CountingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 1, 3, 2, 4, 6, 5, 8, 2, 5 };

		countingSort(arr);
		System.out.print(" Counting Sorting :: ");

		for (int num : arr) {
			System.out.print(num +" ");
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
		/*
		 * for (int i = 0; i <= max; i++) { while (freqArray[i] > 0) { arr[index++] = i;
		 * freqArray[i]--; } }
		 */

		for (int i = 1; i < freqArray.length; i++) {
			freqArray[i] = freqArray[i] + freqArray[i - 1];

		}
		
		
		int[] result = new int[arr.length];
		for(int i = arr.length - 1 ; i>= 0; i--) {
			result[freqArray[arr[i]] -1] = arr[i];
			freqArray[arr[i]]--;
			
		}
        
        System.arraycopy(result, 0, arr, 0, arr.length);

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
