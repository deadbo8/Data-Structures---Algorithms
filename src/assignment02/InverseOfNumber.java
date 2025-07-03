package assignment02;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int reversed = 0;
		int i = 1;

		while (n > 0) {
			int rem = n % 10 - 1;
			reversed = (int) (reversed + (i * Math.pow(10, rem)));
			n /= 10;
			i++;
		}

		System.out.println(reversed);

		s.close();

	}

}
