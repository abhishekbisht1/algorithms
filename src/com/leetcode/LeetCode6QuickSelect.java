package com.leetcode;

import java.util.Random;

public class LeetCode6QuickSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		System.out.println("Kth largest element: " + findKthLargest(arr, k)); // Output: 5

	}

	private static int findKthLargest(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		// kth largest is (n - k)th smallest (0-indexed)
		return quickSelect(arr, 0, n - 1, n-k);

	}

	private static int quickSelect(int[] arr, int left, int right, int kSmallest) {
		// TODO Auto-generated method stub

		if (left == right) {
			return arr[left];
		}

		int pivotIndex = partition(arr, left, right);
		
		if (pivotIndex == kSmallest)
			return arr[pivotIndex];

		else if (pivotIndex > kSmallest)
			return quickSelect(arr, left, pivotIndex - 1, kSmallest);

		else
			return quickSelect(arr, pivotIndex + 1, right, kSmallest);

	}

	private static int partition(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		
		int pivotIndex = left + new Random().nextInt(right - left + 1);
		int pivotValue = arr[pivotIndex];
		swap(arr, pivotIndex, right);
		int storeIndex = left;

		for (int i = left; i < right; i++) {
			if (arr[i] < pivotValue) {
				swap(arr, pivotIndex, i);
				storeIndex++;
			}
		}
		swap(arr, storeIndex, right);
		return storeIndex;
	}

	private static void swap(int[] arr, int pivotIndex, int right) {
		// TODO Auto-generated method stub
		int temp = arr[pivotIndex];
		arr[pivotIndex] = arr[right];
		arr[right] = temp;
	}
}
