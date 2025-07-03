package lecture04;

import java.util.Scanner;

public class FirstNNaturalSum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i = 1;
		int sum = 0;

		while (i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		s.close();
	}

}
