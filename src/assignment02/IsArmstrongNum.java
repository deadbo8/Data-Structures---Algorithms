package assignment02;

import java.util.*;

public class IsArmstrongNum {

	public static int CountOfDigit(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static boolean isArmstrong(int n) {

		boolean isArmstrong = false;
		int original = n;

		int count = CountOfDigit(n);

		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			sum += (int) Math.pow(rem, count);
			n /= 10;
		}

		if (sum == original) {
			isArmstrong = true;
		}

		return isArmstrong;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		System.out.println(isArmstrong(n));

		s.close();
	}
}
