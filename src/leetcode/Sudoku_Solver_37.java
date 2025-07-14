package leetcode;

import java.util.Scanner;

public class Sudoku_Solver_37 {
	
	public static void solveSudoku(char[][] board) {
        sudoku(board,0,0);
    }
	
	public static boolean sudoku(char[][] board, int row, int col) {
		if(col==9) {
			return sudoku(board,row+1,0);
		}
		if(row ==9) {
			return true;
		}
		
		if(board[row][col]!='.') {
			return sudoku(board, row, col+1);
		}else {
			for(int x =1; x<=9;x++) {
				if(safe(board,row,col,x)){
					board[row][col]=(char)(x+'0');
					if(sudoku(board, row, col+1)) {
						return true;
					}
					board[row][col]='.';
				}
				
			}
		}
		return false;
	}
	
	public static boolean safe(char[][] board, int row, int col, int x) {
		char ch = (char)(x+'0');  
		for(int i =0; i<9;i++) {   //to check in the row 
			if(board[row][i]==ch) {
				return false;
			}
		}
		
		for(int i =0; i<9;i++) {    //to check in the col
			if(board[i][col]==ch) {
				return false;
			}
		}
		
		int mainrow=row-row%3;
		int maincol=col-col%3;
		
		for(int i =mainrow; i<mainrow+3;i++) {   //3*3 check krne ke liye
			for( int j =maincol;j<maincol+3;j++) {
				if(board[i][j]==ch) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char[][] board = {
			    {'5','3','.','.','7','.','.','.','.'},
			    {'6','.','.','1','9','5','.','.','.'},
			    {'.','9','8','.','.','.','.','6','.'},
			    {'8','.','.','.','6','.','.','.','3'},
			    {'4','.','.','8','.','3','.','.','1'},
			    {'7','.','.','.','2','.','.','.','6'},
			    {'.','6','.','.','.','.','2','8','.'},
			    {'.','.','.','4','1','9','.','.','5'},
			    {'.','.','.','.','8','.','.','7','9'}
			};
		
		solveSudoku(board);
		
		s.close();
	}
}
