package assignment06;

import java.util.Scanner;

public class NthTriangleRecursion {

	public static int ntriangle(int n, int sum, int m) {

		if (n > m) {
			return sum;
		}

		return ntriangle(n + 1, sum+n, m);

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int res = ntriangle(1, 0, n);
		System.out.println(res);

		s.close();
	}
}
