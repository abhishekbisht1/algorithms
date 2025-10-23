package com.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode3TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		System.out.println(topKFrequent(arr, k));

	}

	private static int[] topKFrequent(int[] arr, int k) {
		// TODO Auto-generated method stub
		if (k == arr.length) {
			return arr;
		}

		Map<Integer, Integer> count = new HashMap<>();
		for (int n : arr) {
			count.put(n, count.getOrDefault(n, 0) + 1);
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));

		for (int n : count.keySet()) {
			pq.add(n);
			if (pq.size() > k) {
				pq.poll();
			}
		}
		
		int [] top = new int[k];
		int n = pq.size() - 1;
		for(int i = k -1; i>=0 ; i--) {
			top[i] = pq.poll();
			
		}

		return top;
	}

}
