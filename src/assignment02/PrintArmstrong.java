package assignment02;

import java.util.Scanner;

public class PrintArmstrong {
	public static int CountOfDigit(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static void isArmstrong(int n) {

		int original = n;

		int count = CountOfDigit(n);

		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			sum += (int) Math.pow(rem, count);
			n /= 10;
		}

		if (sum == original) {
			System.out.println(original);
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int n2 = s.nextInt();

		for (int i = n1; i <= n2; i++) {
			isArmstrong(i);
		}

		s.close();
	}
}
