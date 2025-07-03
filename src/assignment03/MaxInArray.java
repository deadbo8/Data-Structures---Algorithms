package assignment03;

import java.util.Scanner;

public class MaxInArray {
	public static int MaxVlaue(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				index = i + 1;
			}
		}

		return arr[index];
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println(MaxVlaue(arr));
		s.close();

	}
}
