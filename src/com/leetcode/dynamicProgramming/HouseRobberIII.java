package com.leetcode.dynamicProgramming;

public class HouseRobberIII {

	private static TreeNode root = new TreeNode();

	public static void main(String[] args) {
		root = createTree(root);
		
	}

	private static TreeNode createTree(TreeNode root2) {
		// TODO Auto-generated method stub
		
		root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(1);
		return root;
		
	}
}

class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(TreeNode left, TreeNode right, int val) {
		this.left = left;
		this.right = right;
		this.val = val;
	}
}