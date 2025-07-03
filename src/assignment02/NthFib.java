package assignment02;

import java.util.Scanner;

public class NthFib {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		if (n == 0) {
			System.out.println("0");
		} else if (n == 1) {
			System.out.println("1");
		} else {
			int i = 2;
			int fib = 0;
			int next = 1;
			int prev = 0;
			while (i <= n) {
				fib = prev + next;
				prev = next;
				next = fib;
				i++;
			}

			System.out.println(fib);

		}

		s.close();
	}

}
