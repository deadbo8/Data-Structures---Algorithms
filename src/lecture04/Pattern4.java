package lecture04;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int j = s.nextInt();

		int row = 0;

		while (row < j) {
			int i = 0;
			while (i < n) {
				System.out.print("*");
				i++;
			}
			n--;
			row += 1;
			System.out.println();
		}

		s.close();
	}
}
