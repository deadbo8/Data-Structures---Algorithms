package assignment02;

import java.util.Scanner;

public class FahtToCel {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();

		while (start <= end) {
			int cel = (int) (((5 * (start - 32)) / 9));

			System.out.println(start + "	" + cel);
			start += step;
		}
		s.close();
	}

}
