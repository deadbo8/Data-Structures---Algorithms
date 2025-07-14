package assignment06;

import java.util.Scanner;

public class Mazepath_D {

	public static int path(int row, int col, int n, int m, String s) {
		if (row >= n || col >= m) {
			return 0;
		}

		if (row == n - 1 && col == m - 1) {
			System.out.print(s+" ");
			return 1;
		}

		int x = path(row + 1, col, n, m, s + "V");
		int y = path(row, col + 1, n, m, s + "H");
		int z = path(row + 1, col + 1, n, m, s + "D");

		return x + y + z;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();

		int count = path(0, 0, n, m, "");
        System.out.println();
		System.out.println(count);

		s.close();
	}
}
