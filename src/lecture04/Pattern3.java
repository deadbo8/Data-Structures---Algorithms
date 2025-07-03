package lecture04;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int j = s.nextInt();

		int row = 0;

		while (row < j) {
			int i = 0;
			while (i <= row) {
				System.out.print("*");
				i++;
			}
			row += 1;
			System.out.println();
		}

		s.close();
	}
}
