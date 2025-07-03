package assignment01;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int nst = n / 2;
		int nsp = 1;

		int row = 0;

		while (row < n) {

			if (row == 0 || row == n - 1) {
				int i = 0;
				while (i < n) {
					System.out.print("*	");
					i++;
				}

				row++;
				System.out.println();

			} else {
				int i = 0;
				while (i < nst) {
					System.out.print("*	");
					i++;
				}

				i = 0;
				while (i < nsp) {
					System.out.print(" 	");
					i++;
				}

				i = 0;
				while (i < nst) {
					System.out.print("*	");
					i++;
				}
				System.out.println();

				if (row < n / 2) {
					nst -= 1;

					nsp += 2;
				} else {

					nst += 1;
					nsp -= 2;

				}
				row++;

			}

		}
		s.close();
	}
}
