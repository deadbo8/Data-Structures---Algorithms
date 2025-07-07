package lecture16Recursion;

import java.util.Scanner;

public class Recursion_Demo_Factorial {
	
	public static int factorial(int n) {
		
		//base case
		if(n==0) {
			return 1;
		}
		
		//recursive call
		int x =factorial(n-1);
		
		//small calculation
		return n*x;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(factorial(n));
		
		s.close();
	}
}
