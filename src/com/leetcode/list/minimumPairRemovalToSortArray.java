package com.leetcode.list;

import java.util.ArrayList;
import java.util.List;

public class minimumPairRemovalToSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 2, 3, 1 };

		System.out.println(minimumPairRemoval(arr));

	}

	private static int minimumPairRemoval(int[] arr) {
		// TODO Auto-generated method stub

		if ((arr.length == 0) || (arr == null))
			return 0;

		List<Integer> list = new ArrayList<>();

		for (int n : arr)
			list.add(n);

		int operations = 0;

		while (!isSorted(list)) {

			int minSum = Integer.MAX_VALUE;
			int minIdx = 0;

			for (int i = 0; i < list.size() - 1; i++) {

				int sum = list.get(i) + list.get(i + 1);
				if (sum < minSum) {
					minSum = sum;
					minIdx = i;
				}
			}

			int merged = list.get(minIdx) + list.get(minIdx + 1);
			list.remove(minIdx + 1);
			list.set(minIdx, merged);
			operations++;

		}

		return operations;

	}

	private static boolean isSorted(List<Integer> list) {
		// TODO Auto-generated method stub
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) < list.get(i - 1)) {
				return false;
			}

		}
		return true;
	}

}
