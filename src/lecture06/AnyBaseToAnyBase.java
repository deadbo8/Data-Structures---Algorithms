package lecture06;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int S_base = s.nextInt();
		int n = s.nextInt();
		int D_base = s.nextInt();

		int sum = 0;
		int mul = 1;
		int newsum = 0;

		while (n > 0) {
			int unit = n % 10;
			sum += mul * unit;
			mul *= S_base;
			n /= 10;
		}
		
		if (D_base == 10) {
			System.out.println(sum);
		} else {
			
			mul=1;

			while (sum > 0) {
				int unit = sum % D_base;
				newsum += mul * unit;
				mul *= 10;
				sum /= D_base;

			}

			System.out.println(newsum);
		}
		s.close();
	}

}
