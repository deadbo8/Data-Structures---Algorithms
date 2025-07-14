package leetcode;

import java.util.Scanner;

public class UniquePath_I {
	public static int uniquePaths(int m, int n) {
	    int count = helper(m, n, 0, 0);
	    
	    return count;

	    }

	    public static int helper(int m, int n, int row, int col){
	        if (row >= m || col >= n) {
				return 0;
			}

			if (row == m - 1 && col == n - 1) {
				return 1;
			}

			int x = helper(m, n, row + 1, col);
	        int y = helper(m, n, row, col + 1);

			return x + y;
	    }
	    
	    public static void main(String[] args) {
	    	
			Scanner s = new Scanner(System.in);
			
			
			
			int m = s.nextInt();
			int n = s.nextInt();
			
			int count = uniquePaths(m,n);
			
			System.out.println(count);
			
			s.close();


		}
}
