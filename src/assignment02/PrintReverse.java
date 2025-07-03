package assignment02;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;

		String s1 = Integer.toString(n);

		int length = s1.length() - 1;

		while (n > 0) {
			int rem = n % 10;

			sum += rem * Math.pow(10, length);

			length--;
			n /= 10;
		}

		System.out.println(sum);

		s.close();
	}

}
