package lecture12;

import java.util.Scanner;

public class Spiral_print {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int m = s.nextInt();
		int n =s.nextInt();

		int[][] mat = new int[m][n];

		for(int i =0; i<m;i++){
			for(int j=0; j<n;j++){
				mat[i][j]=s.nextInt();
			}
		}

		int itr = 0;
		int te=m*n;
		int count=0;

		while (count<te) {
			int row = itr, col = itr;
			for (; col < mat[row].length - itr && count<te; col++) {
				System.out.print(mat[row][col] + " ");
				count++;
			}

			row++;
			col--;
			

			for (; row < mat.length - itr && count<te; row++) {
				System.out.print(mat[row][col] + " ");
				count++;
			}
			col--;
			row--;

			
		        for (; col >= itr && count<te; col--) {
		            System.out.print(mat[row][col] + " ");
		            count++;
		        }

		    row--;
		    col++;


		    
		        for (; row > itr && count<te; row--) {
		            System.out.print(mat[row][col] + " ");
		            count++;
		        }

		   

			itr++;

		}
		s.close();
	}
}
