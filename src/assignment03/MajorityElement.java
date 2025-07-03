package assignment03;

import java.util.Scanner;

public class MajorityElement {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int vote = 1, element = arr[0];

		for (int i = 1; i < n; i++) {
			if (arr[i] == element) {
				vote++;
			} else {
				vote--;
				if (vote == 0) {
					element = arr[i];
					vote = 1;
				}

			}
		}

		System.out.println(element);

		s.close();
	}
}
