package assignment01;

import java.util.Scanner;

public class PatternMagiv {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 0;

		int nst = n - 1;

		int nsp = 1;

		while (row < 2 * n - 1) {

			if (row == 0 || row == 2 * n - 2) {
				int i = 0;
				while (i < 2 * n - 1) {
					System.out.print("*");
					i++;
				}
				row++;
				System.out.println();
			} else {
				int i = 0;
				while (i < nst) {
					System.out.print("*");
					i++;
				}
				i = 0;
				while (i < nsp) {
					System.out.print(" ");
					i++;
				}
				i = 0;
				while (i < nst) {
					System.out.print("*");
					i++;
				}

				if (row < n - 1) {
					nst--;
					nsp += 2;

				} else {
					nst++;
					nsp -= 2;

				}

				row++;
				System.out.println();

			}
		}

		s.close();
	}
}
