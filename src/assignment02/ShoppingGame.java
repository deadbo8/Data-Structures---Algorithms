package assignment02;

import java.util.Scanner;

public class ShoppingGame {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while (t > 0) {
			int a = s.nextInt();
			int h = s.nextInt();
			int n = 1;

			while (a >= 0 && h >= 0) {

				a -= 2 * n - 1;
				h -= 2 * n;
				n++;
				if (a < 0) {
					System.out.println("Harshit");
					break;
				}

				if (h < 0) {
					System.out.println("Aayush");

				}
			}
			t--;
		}
		s.close();
	}
}
