package assignment01;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int nst = 1;
		int nsp = n - 1;

		int row = 0;

		while (row < n) {
			int i = 0;
			while (i < nsp) {
				System.out.print("	");
				i++;
			}

			i = 0;
			int count = 0 + row;
			while (i < nst) {
				if (i <= nst / 2) {
					count++;
					System.out.print(count + "	");

					i++;
				} else {
					count--;
					System.out.print(count + "	");
					i++;
				}

			}
			System.out.println();
			nst += 2;
			nsp--;
			row++;
		}

		s.close();
	}

}
