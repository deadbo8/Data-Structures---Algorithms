package lecture04;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int nsp = 0;
		int nst = n;

		int row = 0;

		while (row < n) {
			int i = 0;
			while (i < nsp) {
				System.out.print("  ");
				i++;
			}

			i = 0;
			while (i < nst) {
				System.out.print("* ");
				i++;
			}

			nsp+=2;
			nst--;
			row++;
			System.out.println();
		}
		s.close();
	}

}
