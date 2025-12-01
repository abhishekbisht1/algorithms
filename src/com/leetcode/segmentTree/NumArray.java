package com.leetcode.segmentTree;

public class NumArray {
	
	int[] tree;
	int n;

	public NumArray(int[] nums) {
		n = nums.length;
		tree = new int[4 * n];
		build(nums, 0, 0, n-1);

	}

	private void build(int[] nums, int node, int left, int right) {
		// TODO Auto-generated method stub
		
	}
}
