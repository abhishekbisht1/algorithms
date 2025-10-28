package com.leetcode.sorting.comparison;

public class LeetCode2MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 38, 27, 43, 3, 9, 82, 10 };

		System.out.println("Before sorting: ");
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();

		sort(arr, 0, arr.length - 1);

		System.out.println("After sorting: ");
		for (int x : arr)
			System.out.print(x + " ");

	}

	private static void sort(int[] arr, int left, int right) {
		// TODO Auto-generated method stub

		if (left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			merge(arr, left, mid, right);

		}

	}

	private static void merge(int[] arr, int left, int mid, int right) {
		// TODO Auto-generated method stub

		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] left_ = new int[n1];
		int[] right_ = new int[n2];

		for (int a = 0; a < n1; a++) {
			left_[a] = arr[left + a];
		}

		for (int b = 0; b < n2; b++) {
			right_[b] = arr[mid + 1 + b];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {

			if (left_[i] <= right_[j])
				arr[k++] = left_[i++];
			else
				arr[k++] = right_[j++];

		}

		while (i < n1)
			arr[k++] = left_[i++];
		while (j < n2)
			arr[k++] = right_[j++];

	}

}
