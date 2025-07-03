package assignment02;

import java.util.Scanner;

public class SimpleInput {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int sum = 0;

		while (sum >= 0) {
			int n = s.nextInt();

			sum += n;
			if (sum >= 0) {
				System.out.println(n);
			} else {
				break;
			}

		}

		s.close();
	}
}
