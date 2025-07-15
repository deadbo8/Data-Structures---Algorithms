package assignment06;

import java.util.Scanner;

public class Odd_Even_Using_Recursion {

	public static void oddEven(int n, int sub, int m) {

		if (n == 1) {
			System.out.println(n);
			n = 0;

			sub = 2;
		}

		if (n > m) {
			return;
		}
		if (n != 0) {
			System.out.println(n);
		}

		oddEven(n + sub, sub, m);

	}

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = n;

		if(n%2==0) {
			oddEven(n-1, -2, m);
		}else {
		
		oddEven(n, -2, m);
		
		}
		
		s.close();

	}
}
