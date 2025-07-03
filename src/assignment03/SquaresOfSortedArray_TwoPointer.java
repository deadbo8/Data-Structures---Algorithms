package assignment03;

import java.util.Scanner;

public class SquaresOfSortedArray_TwoPointer {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int[] result = new int[n];

		int left = 0, right = n - 1, pos = n - 1;

		while (left <= right) {
			int leftSq = arr[left] * arr[left], rightSq = arr[right] * arr[right];
			if (leftSq > rightSq) {
				result[pos--] = leftSq;
				left++;
			} else {
				result[pos--] = rightSq;
				right--;
			}

		}
		for (int val : result) {
			System.out.println(val);
		}
		s.close();

	}

}
