package assignment03;

import java.util.Scanner;

public class VonNeumanLovesBinary {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		while (T > 0) {

			long decimal = 0;
			long binary = s.nextLong();
			int mul = 0;

			while (binary > 0) {
				System.out.println("binary is"+binary);
				long rem =  binary % 10;
				System.out.println("rem is"+rem);
				decimal += rem * Math.pow(2, mul);
				System.out.println("decimal is"+decimal);
				mul++;
				binary /= 10;
				

			}
			System.out.println(decimal);
			T--;
		}
		s.close();
	}
}
