package assignment02;

import java.util.Scanner;

public class AnybaseToAnybase {

	public static int toDecimal(int sbase, int n) {
		int con = 0;
		int i = 0;
		while (n > 0) {
			int rem = n % 10;
			con += rem * Math.pow(sbase, i);
			i++;
			n /= 10;
		}
		return con;

	}

	public static int todbase(int dbase, int n) {
		int con = 0;
		int mul = 0;

		while (n > 0) {
			int rem = n % dbase;
			con += rem * Math.pow(10, mul);
			mul++;
			n /= dbase;
		}

		return con;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int sbase = s.nextInt();
		int dbase = s.nextInt();

		int n = s.nextInt();

		int converted = todbase(dbase, toDecimal(sbase, n));

		System.out.println(converted);

		s.close();
	}

}
