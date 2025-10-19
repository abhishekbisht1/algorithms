package com.leetcode;

import java.util.stream.IntStream;

public class LeetCode2UniquePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 4, 4, 4, 4 , 4};

		System.out.println(uniquePath(arr));

	}

	private static long uniquePath(int[] arr) {
		// TODO Auto-generated method stub
		long uniquePath = IntStream.of(arr).distinct().count();

		return uniquePath < 2 ? 0 : uniquePath * (uniquePath - 1) / 2;

	}

}
