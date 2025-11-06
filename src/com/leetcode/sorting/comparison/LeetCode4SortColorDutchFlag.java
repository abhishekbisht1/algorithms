package com.leetcode.sorting.comparison;

import java.util.Arrays;

public class LeetCode4SortColorDutchFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dutchFlag = { 2, 0, 2, 1, 1, 0 };
		sortColor(dutchFlag);
		System.out.println(Arrays.toString(dutchFlag));

	}

	private static void sortColor(int[] dutchFlag) {
		// TODO Auto-generated method stub

		int low = 0, mid = 0, high = dutchFlag.length - 1;

		while (mid <= high) {

			if (dutchFlag[mid] == 0) {
				swap(dutchFlag, low, mid);
				low++;
				mid++;

			} else if (dutchFlag[mid] == 1) {
				mid++;

			} else {
				swap(dutchFlag, mid, high);
				high--;
			}
		}

	}

	private static void swap(int[] dutchFlag, int l, int h) {
		// TODO Auto-generated method stub
		int temp = dutchFlag[l];
		dutchFlag[l] = dutchFlag[h];
		dutchFlag[h] = temp;

	}


}
