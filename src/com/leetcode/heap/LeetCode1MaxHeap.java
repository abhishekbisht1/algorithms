package com.leetcode.heap;

import java.util.PriorityQueue;
import java.util.Random;

public class LeetCode1MaxHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		System.out.println("Kth largest element: " + findKthLargest(arr, k)); // Output: 5

	}

	private static int findKthLargest(int[] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

		for (int num : arr) {
			pq.add(num);
		}
		
		int n = 0;

		while (n < k - 1 && !pq.isEmpty()) {
			pq.poll();
			n++;
		}

		return pq.peek();

	}

}
