package assignment03;

import java.util.Scanner;

public class CalculateTheSum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int mod = 1000000007;
		int sum = 0;
		for (int val : arr) {
			sum = (sum + val) % mod;
		}

		int T = s.nextInt();

		for (int i = 0; i < T; i++) {
			s.nextInt();
		}

		long pow = 1;
		for (int i = 0; i < T; i++) {
			pow = (pow * 2) % mod;
		}

		long res = sum * pow % mod;

		System.out.println(res);
		s.close();
	}

}
