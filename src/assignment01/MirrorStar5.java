package assignment01;

import java.util.Scanner;

public class MirrorStar5 {
	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if(n%2!=0) {
			
		int row =0;
		int nsp= n/2;
		int nst=1;
		
		while(row<n) {
			int i =0; 
			while(i<nsp) {
				System.out.print("	");
				i++;
			}
			i =0;
			while(i<nst) {
				System.out.print("*	");
				i++;
			}
			
			if(row<n/2) {
				nst+=2;
				nsp--;
			}else {
				nst-=2;
				nsp++;
			}
			
			row++;
			System.out.println();
		}
			
		}else {
			System.out.println("invalid input");
		}
		
		
		s.close();
	}
}
