package assignment01;

import java.util.Scanner;

public class NumberLadder {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row =0;
		int nst=1;
		int counter=1;
		
		while(row<n) {
			int i =0;
			while(i<nst) {
				System.out.print(counter+"	");
				counter++;
				i++;
			}
			
			nst++;
			row++;
			System.out.println();
			
		}
		
		s.close();
	}
}
