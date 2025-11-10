package com.leetcode.binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode5ZigZagTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode_2 root = new TreeNode_2();
		TreeNode_2 node = constructTree(root);
		List<List<Integer>> zigzagTraversal = zigzagTraversal(node);
		for (List list : zigzagTraversal) {
			System.out.println(list.toString());
		}
	}

	private static List<List<Integer>> zigzagTraversal(TreeNode_2 root) {
		// TODO Auto-generated method stub
		if (root == null)
			return null;

		boolean leftToRight = true;
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode_2> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			List<Integer> list = new ArrayList<>(levelSize);

			for (int i = 0; i < levelSize; i++) {
				TreeNode_2 node = queue.poll();
				list.add(node.data);

				if (node.left != null)
					queue.offer(node.left);
				if (node.right != null)
					queue.offer(node.right);

			}

			if (!leftToRight)
				Collections.reverse(list);

			result.add(list);
			
			leftToRight = !leftToRight;

		}
		return result;

	}

	private static TreeNode_2 constructTree(TreeNode_2 root) {
		// TODO Auto-generated method stub
		/*
		 * root = new TreeNode_2(1); root.left = new TreeNode_2(2); root.right = new
		 * TreeNode_2(3); root.left.left = new TreeNode_2(4); root.right.right = new
		 * TreeNode_2(5);
		 */
		
		  root = new TreeNode_2(3); root.left = new TreeNode_2(9); root.right = new
		  TreeNode_2(20); root.right.left = new TreeNode_2(15); root.right.right = new
		  TreeNode_2(7);
		 
		return root;
	}

}

class TreeNode_2 {
	TreeNode_2 left;
	TreeNode_2 right;
	int data;

	public TreeNode_2() {

	}

	public TreeNode_2(int data) {
		this.data = data;
	}

	public TreeNode_2(TreeNode_2 left, TreeNode_2 right, int data) {
		this.left = left;
		this.right = right;
		this.data = data;
	}
}