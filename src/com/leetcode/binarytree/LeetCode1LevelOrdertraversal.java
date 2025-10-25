package com.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode1LevelOrdertraversal {

	static Node root = new Node();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node roota = constructBinaryTree(root);
		List<List<Integer>> treeTraversal = levelOrderTraversal(roota);
		printLevelOrderTravcersal(treeTraversal);

	}

	private static void printLevelOrderTravcersal(List<List<Integer>> treeTraversal) {
		// TODO Auto-generated method stub
		for (List<Integer> list : treeTraversal) {
			System.out.println(list);
			for (int data : list) {
				System.out.println("printed data :" + data);
			}
		}
	}

	private static Node constructBinaryTree(Node root) {
		// TODO Auto-generated method stub

		root = new Node(3);
		root.left = new Node(9);
		root.right = new Node(20);
		root.right.left = new Node(15);
		root.right.right = new Node(7);
		return root;
	}

	private static void preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	private static List<List<Integer>> levelOrderTraversal(Node root) {

		List<List<Integer>> list = new ArrayList<>();
		preorder(root);

		if (root == null)
			return list;

		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> level = new LinkedList<>();

			for (int i = 0; i < size; i++) {
				Node node = queue.poll();
				level.add(node.data);

				if (node.left != null)
					queue.offer(node.left);
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
			list.add(level);

		}
		return list;
	}
}

class Node {
	Node left;
	Node right;
	int data;

	public Node(Node left, Node right, int data) {
		this.left = left;
		this.right = right;
		this.data = data;
	}

	Node() {

	}

	Node(int data) {
		this.data = data;
	}
}