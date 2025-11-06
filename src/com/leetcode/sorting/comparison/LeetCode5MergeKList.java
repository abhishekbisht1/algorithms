package com.leetcode.sorting.comparison;

import java.util.PriorityQueue;

public class LeetCode5MergeKList {

	static ListNode node;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[][] arr = { { 1, 3, 5 }, { 1, 3, 4 }, { 3, 6 } };

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode l3 = new ListNode(3);
		l3.next = new ListNode(6);

		ListNode[] lists = { l1, l2, l3 };

		ListNode result = mergeKList(lists);
		// print merged list
		while (result != null) {
			System.out.print("Element :"+ result.data + " ");
			result = result.next;
		}

	}

	private static ListNode mergeKList(ListNode[] lists) {
		// TODO Auto-generated method stub

		PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

		for (ListNode node : lists) {

			if (node != null)
				pq.offer(node);

		}

		ListNode current = new ListNode(0);
		ListNode tail =  current;

		while (!pq.isEmpty()) {

			ListNode smallest = pq.poll();
			current.next = smallest;
			current = current.next;

			if (smallest.next != null)
				pq.offer(smallest.next);

		}

		return tail.next;

	}

}

class ListNode {
	ListNode next;
	int data;

	public ListNode(int data) {
		this.data = data;
	}

}
