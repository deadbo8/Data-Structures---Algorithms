package assignment02;

import java.util.Scanner;

public class Chewbaka {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		long x = s.nextLong();
		long mul = 1;
		long reversed = 0;

		while (x > 0) {
			long rem = x % 10;
			if (rem == 9 && x < 10) {
				reversed += rem * mul;
			} else if ((9 - rem) < rem) {
				reversed += (9 - rem) * mul;
			} else {
				reversed += rem * mul;
			}

			mul *= 10;
			x /= 10;
		}

		System.out.println(reversed);

		s.close();
	}

}
