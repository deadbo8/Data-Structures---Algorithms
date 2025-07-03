package assignment03;

import java.util.Scanner;

public class AlexGoesShopping {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int T = s.nextInt();

		while (T-- > 0) {

			int money = s.nextInt();
			int items = s.nextInt();
			int count = 0;

			for (int i = 0; i < n; i++) {
				if (money % arr[i] == 0) {
					count++;
				}
			}

			if (count >= items) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		s.close();
	}
}
