package assignment02;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();

		int i = 1;

		while (i <= n1 * n2) {
			if (i % n1 == 0 && i % n2 == 0) {
				System.out.println(i);
				break;
			}
			i++;
		}

		s.close();
	}
}
