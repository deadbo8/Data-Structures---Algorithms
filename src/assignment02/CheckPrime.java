package assignment02;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n <= 1) {
			System.out.println("Not Prime");
		} else {
			boolean isPrime = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		}

		s.close();
	}
}
