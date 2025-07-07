package lecture16Recursion;

import java.util.Scanner;

public class Print_Decreasing {
	
	public static void printDecreasing(int n) {
		
		// base	
		if(n<=0) {
			return ;
		}
		
	    
		//calculation
		System.out.println(n);
		
		//recursive call
	    printDecreasing(n-1);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		printDecreasing(n);
		
		s.close();
	}
}
