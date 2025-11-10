package com.leetcode.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode2levelOrderTraversal {

	static TreeNode node = new TreeNode();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = constructBinaryTree(node);
		List<List<Integer>> outPut = levelOrderaTraversal(root);
		
		for(List list: outPut){
			System.out.println(list.toString());
		}

	}

	private static List<List<Integer>> levelOrderaTraversal(TreeNode root_) {
		// TODO Auto-generated method stub

		List<List<Integer>> result = new ArrayList<>();

		if (root_ == null)
			return result;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root_);

		while (!queue.isEmpty()) {
			
			int levelSize = queue.size();
			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < levelSize; i++) {
				TreeNode node = queue.poll();
				list.add(node.data);

			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);

		}
			
			result.add(list);
		}

		return result;

	}

	private static TreeNode constructBinaryTree(TreeNode node) {
		// TODO Auto-generated method stub

		node = new TreeNode(3);
		node.left = new TreeNode(9);
		node.right = new TreeNode(20);
		node.right.left = new TreeNode(15);
		node.right.right = new TreeNode(7);

		return node;

	}

}

class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;

	public TreeNode() {

	}

	public TreeNode(int data) {
		this.data = data;
	}

	public TreeNode(TreeNode left, TreeNode right, int data) {
		this.left = left;
		this.right = right;
		this.data = data;
	}
}
