package lecture04;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int nsp = n - 1;
		int nst = 1;

		int row = 0;

		while (row < n) {
			int i = 0;
			while (i < nsp) {
				System.out.print("  ");
				i++;
			}

			i = 0;
			while (i < nst) {

				if (i % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				i++;
			}

			nsp--;
			nst += 2;

			row++;
			System.out.println();
		}

		s.close();
	}

}
