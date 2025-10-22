package com.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeetCode5MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] nums = {1, 3, 5};
        int[] nums_1 = {2, 4, 6, 8};
		
		System.out.println(MergeArrays(nums,nums_1));
		
		}

	private static int MergeArrays(int[] nums, int[] nums_1) {
		// TODO Auto-generated method stub
		int totalLength = nums.length + nums_1.length;
		
		int [] merged = IntStream.concat(Arrays.stream(nums), Arrays.stream(nums_1)).sorted().toArray();
		
		if(totalLength % 2 ==1) {
			return merged[totalLength/2];
			
		}else {
			return merged[totalLength/2 - 1 ] + merged[totalLength/2] /2;
		}
	}


}
