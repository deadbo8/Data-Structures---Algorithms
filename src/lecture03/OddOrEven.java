package lecture03;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		s.close();
	}
}