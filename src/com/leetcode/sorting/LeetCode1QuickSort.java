package com.leetcode.sorting;

public class LeetCode1QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 7, 8, 9, 1, 5 };
		quickSort(arr,0 ,arr.length - 1);

		System.out.println("Quick Sorted Array: ");

		for (int num : arr) {
			System.out.println(num);
		}

	}

	private static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub


		if(low < high) {
		int partition = partition(arr, low, high);

		quickSort(arr,low , partition -1  );
		quickSort(arr,partition + 1 ,high);
		
		}

	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub

		int pivot = arr[high];
		int initial = low;
		for (int i = low; i < high; i++) {
			
			if (arr[i] <= pivot) {
				swap(arr, initial, i);
				initial++;
			}
		}
		swap(arr,initial , high);
		return initial;
	}

	private static int[] swap(int[] arr, int initial, int i) {
		
	 int temp = arr[initial] ;
	 arr[initial] = arr[i] ;
	 arr[i] =  temp;
	 
	 return arr;

	}

}
