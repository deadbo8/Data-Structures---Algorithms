package lecture02;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int p = s.nextInt();
		int r = s.nextInt();
		int t = s.nextInt();

		int si = (p * r * t) / 100;
		System.out.println(si);
		
		s.close();

	}

}
