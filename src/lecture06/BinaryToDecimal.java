package lecture06;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		
		
		int mult = 1;
		int sum = 0;

		while (n > 0) {

			int rem = n % 10;
			sum += mult * rem;
			mult *= 2;
			n /= 10;

		}

		System.out.println(sum);

		s.close();
	}

}
