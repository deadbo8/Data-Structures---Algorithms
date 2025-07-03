package lecture12;

import java.util.Scanner;

public class Input_Output_2DArray {
	
	public static void Print(int[][] arr) {
		for(int i =0; i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		
		int m =s.nextInt();
		
		int[][] arr= new int[n][m];
		
		for(int i =0; i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++){
				arr[i][j]=s.nextInt();
			}
		}
		
		
		
		Print(arr);
		
		
		s.close();
	}
}
