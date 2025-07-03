package lecture04;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int i = 0;

		while (i < n) {
			System.out.print("*");
			i++;
		}
		s.close();
	}
}
