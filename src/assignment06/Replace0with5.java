package assignment06;

import java.util.Scanner;

public class Replace0with5 {

//	public static int replace(int n, int dev, int sum) {
//		if (n <= 0) {
//			return sum;
//		}
//
//		int rem = n % 10;
//		if (rem == 0) {
//			sum += 5 * dev;
//		} else {
//			sum += rem * dev;
//		}
//
//		return replace(n / 10, dev * 10, sum);

//	}
	
	public static int replace(int n ) {
		if (n == 0) {
			return 0;
		}

		int rem = n % 10;
		if (rem == 0)
			rem = 5;

		return replace(n / 10) * 10 + rem;  // much more cleaner
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

//		int replaced = replace(n, 1, 0);
		
		int replaced = replace(n);

		System.out.println(replaced);
		s.close();
	}
}
