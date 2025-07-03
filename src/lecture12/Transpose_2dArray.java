package lecture12;

import java.util.Scanner;

public class Transpose_2dArray {

	public static void Print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] Transpose(int[][] arr) {
		
		int[][] res =new int[arr[0].length][arr.length];

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] = arr[j][i];
			}
		}
		return res;
		
		
		// inplace transpose works for square matrix
//		for (int i = 0; i < matrix.length - 1; i++) {
//			for (int j = i + 1; j < matrix[0].length; j++) {
//				int temp = matrix[i][j];
//				matrix[i][j] = matrix[j][i];
//				matrix[j][i] = temp;
//			}
//		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		int temp[][] = Transpose(arr);
		Print(temp);

		s.close();
	}
}
