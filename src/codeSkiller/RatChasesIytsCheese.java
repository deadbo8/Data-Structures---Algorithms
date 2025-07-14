package codeSkiller;

import java.util.Scanner;

public class RatChasesIytsCheese {
	
	static boolean noPath=true;
	public static void path(char[][] maze, int[][] res, int row, int col, int m, int n) {

		if (row < 0 || col < 0 || row >= m || col >= n || maze[row][col] == 'x') {
			return;
		}

		if (row == m - 1 && col == n - 1) {
			res[row][col] = 1;
			print(res);
			noPath=false;
			return;
		}

		maze[row][col] = 'x';
		res[row][col] = 1;
		path(maze, res, row, col - 1, m, n);
		path(maze, res, row, col + 1, m, n);
		path(maze, res, row - 1, col, m, n);
		path(maze, res, row + 1, col, m, n);
		
//		int[] r = {-1,0,0,1};                                                 
//		int[] c = {0,-1,1,0};
//		
//		for(int i =0; i<c.length;i++) {
//			path(maze, res, row+r[i],col+c[i],m,n);
//		}
		
		res[row][col] = 0;
		maze[row][col] = 'o';

	}

	public static void print(int[][] res) {
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();

		char[][] maze = new char[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				maze[i][j] = s.next().charAt(0);
			}
		}

		int[][] res = new int[n][m];

		path(maze, res, 0, 0, n, m);
		if(noPath) {
			System.out.println(-1);
		}

		s.close();
	}
}
