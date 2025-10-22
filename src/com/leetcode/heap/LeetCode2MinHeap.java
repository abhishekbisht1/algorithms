package com.leetcode.heap;

import java.util.PriorityQueue;

public class LeetCode2MinHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 2, 1, 4, 5, 6};
		int k = 2;
		
		System.out.println("Kth largest element: " + findKthLargest(arr, k));

	}

	private static int findKthLargest(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int num: arr) {
			pq.add(num);
			
			if(pq.size() >  k)
			   pq.poll();
		}

		return pq.peek();
	}

}
