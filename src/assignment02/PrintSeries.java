package assignment02;

import java.util.Scanner;

public class PrintSeries {

	public static void printseries(int n1, int n2) {
		int i = 1;
		while (n1 > 0) {
			int num = 3 * i + 2;

			if (num % n2 != 0) {
				System.out.println(num);
				n1--;
			}

			i++;
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();

		printseries(n1, n2);

		s.close();
	}
}
