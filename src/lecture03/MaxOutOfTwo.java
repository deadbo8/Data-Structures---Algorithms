package lecture03;

import java.util.Scanner;

public class MaxOutOfTwo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

}
