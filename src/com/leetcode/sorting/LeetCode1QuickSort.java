package com.leetcode.sorting;

public class LeetCode1QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 7, 8, 9, 1, 5 };
		quickSort(arr);

		System.out.println("Quick Sorted Array: ");

		for (int num : arr) {
			System.out.println(num);
		}

	}

	private static void quickSort(int[] arr) {
		// TODO Auto-generated method stub

		int high = arr.length - 1;
		int low = 0;

		int partition = partition(arr, low, high);

		// quickSort();
		// quickSort()

	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub

		int pivot = arr[high];
		int ini = low;
        for(int i = low ; i < high; i++) {
        	if(arr[i] <= pivot) {
        		
        	}
        	
        }
		swap(arr, pivot, low);
		return 0;
	}

	private static int[] swap(int[] arr, int low, int high) {
		
	 int temp = arr[high] ;
	 arr[] = ;
	 arr[] = ;

	}
	
	return arr;

}
