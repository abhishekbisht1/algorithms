package com.leetcode.binaryTree;

public class LeetCode4HeightBinaryTree {

	
	private static TreeNode_1 root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode_1 node = constructBinaryTree(root);
		System.out.println(heightOfTree(node));
	}

	private static int heightOfTree(TreeNode_1 node) {
		// TODO Auto-generated method stub
		if (node == null) return 0;
		
		int left = heightOfTree(node.left);
		int right = heightOfTree(node.right);

		return 1 + Math.max(left, right);
		
		
		
	}

	private static TreeNode_1 constructBinaryTree(TreeNode_1 node) {
		// TODO Auto-generated method stub
		
		node = new TreeNode_1(1);
		node.left = new TreeNode_1(2);
		node.right = new TreeNode_1(3);
		node.left.left = new TreeNode_1(4);
		node.left.right = new TreeNode_1(5);
		
		return node;
	}

}


class TreeNode_1 {
	TreeNode_1 left;
	TreeNode_1 right;
	int data;

	public TreeNode_1() {

	}

	public TreeNode_1(int data) {
		this.data = data;
	}

	public TreeNode_1(TreeNode_1 left, TreeNode_1 right, int data) {
		this.left = left;
		this.right = right;
		this.data = data;
	}
}

