package lecture04;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int j = s.nextInt();
		int row=0;

		while (row < j) {
			int i = 0;
			while (i < n) {
				System.out.print("*");
				i++;

			}
			System.out.println();
			row++;

		}
		s.close();
	}
}
