package com.leetcode.graph.bfs;

import java.util.Arrays;

public class FloodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };

		int sr = 1, sc = 1, color = 2;
		int[][] result = floodFill(image, sr, sc, color);

		System.out.println(Arrays.deepToString(result));

	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

		int originalColor = image[sr][sc];

		if (originalColor == color)
			return image;

		dfs(image, sr, sc, originalColor, color);

		return image;

	}

	public static void dfs(int[][] image, int sr, int sc, int originalColor, int color) {

		int row = image.length;
		int col = image[0].length;

		if (sr < 0 || sc < 0 || sr >= row || sc >= col || image[sr][sc] != originalColor)
			return;

		image[sr][sc] = color;

		dfs(image, sr + 1, sc, originalColor, color);
		dfs(image, sr - 1, sc, originalColor, color);
		dfs(image, sr, sc + 1, originalColor, color);
		dfs(image, sr, sc - 1, originalColor, color);

	}

}
