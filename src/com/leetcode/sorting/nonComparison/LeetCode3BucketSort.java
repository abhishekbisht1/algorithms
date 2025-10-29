package com.leetcode.sorting.nonComparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode3BucketSort {
	public static void main(String[] args) {

		float[] arr = { 0.78f, 0.17f, 0.39f, 0.26f, 0.72f, 0.94f, 0.21f, 0.12f, 0.23f, 0.68f };
		bucketSort(arr);
		System.out.println("Bucket SOrt : ");

		for (float num : arr) {
			System.out.println(num);
		}
	}

	private static float[] bucketSort(float[] arr) {
		// TODO Auto-generated method stub
		if (arr == null)
			return null;

		List<Float>[] buckets = new ArrayList[arr.length];

		for (int i = 0; i < 10; i++) {
			buckets[i] = new ArrayList<>();
		}

		for (float num : arr) {
			int index = (int) ((arr.length - 1) * num);
			buckets[index].add(num);
		}

		for (List<Float> bucket : buckets) {
			Collections.sort(bucket);
		}

		int index = 0;
		for (List<Float> bucket : buckets) {
			for (float num : bucket) {
				arr[index++] = num;
			}
		}

		return arr;

	}
}
