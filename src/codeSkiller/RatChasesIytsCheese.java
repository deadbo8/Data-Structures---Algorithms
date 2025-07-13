package codeSkiller;

import java.util.Scanner;

public class RatChasesIytsCheese {

	public static void path(char[][] maze, int[][] res, int row, int col, int n , int m) {
		
		if(row<0 || col<0 || row>=n || col>=m || maze[row][col]=='x' ) {
			return; 
		}
		
		if(row == n-1 && col == m-1 ) {
			print(res);
			res[row][col]=1;
			return;
		}
		
		maze[row][col]='x';
		path(maze,res,row-1,col,n,m);
		path(maze,res,row-1,col,n,m);
		path(maze,res,row-1,col,n,m);
		path(maze,res,row-1,col,n,m);
		res[row][col]=0;
		maze[row][col]='o';
	
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
		
		path(maze, res,0,0,n,m);


		s.close();
	}
}
