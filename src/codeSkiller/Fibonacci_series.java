package codeSkiller;

import java.util.Scanner;

public class Fibonacci_series {
	
	public static int fib(int n ) {
		
		//base
		if(n==0) {
			return n;
		}
		
		if(n==1) {
			return n;
		}
		
		//recursive call
		int x =fib(n-1)+fib(n-2);
		
		//work
		return x;
		
	
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		int n = s.nextInt();
		
		System.out.println(fib(n));
		
		s.close();
	}
}
