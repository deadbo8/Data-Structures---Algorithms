package lecture04;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int nsd = n - 1;
		int nst = 1;

		int row = 0;

		while (row < n) {
			int i = 0;
			while (i < nsd) {
				System.out.print("$");
				i++;
			}

			i = 0;
			while (i < nst) {
				System.out.print("*");
				i++;
			}

			nsd--;
			nst++;
			row++;
			System.out.println();
		}
		s.close();
	}

}
