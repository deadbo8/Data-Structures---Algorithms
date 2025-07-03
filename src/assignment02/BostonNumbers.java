package assignment02;

import java.util.Scanner;

public class BostonNumbers {

	public static int sumOfDgits(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}

	public static int sumOfFactors(int n) {
		if (n <= 1) return 0;
        int sum = 0;

        while (n % 2 == 0) {
            sum += 2;
            n /= 2;
        }
        
        for (int i = 3; i <= n; i += 2) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }
        return sum;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int Dsum = sumOfDgits(n);
		int Fsum = sumOfFactors(n);

		int i = 0;
		while (i < Integer.MAX_VALUE) {
			if (Fsum > 9 && Dsum > 9) {
				Dsum = sumOfDgits(Dsum);
				Fsum = sumOfDgits(Fsum);
			} else {
				break;
			}
		}

		if (sumOfDgits(Dsum) == sumOfDgits(Fsum)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		s.close();
	}
}
