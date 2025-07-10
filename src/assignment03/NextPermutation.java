package assignment03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		Arrays.sort(arr);

		if (arr.length > 1 && ) {
			int temp = arr[n - 1];
			arr[n - 1] = arr[n - 2];
			arr[n - 2] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		s.close();

	}

}
