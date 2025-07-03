package assignment03;

import java.util.Scanner;

public class Selection_Sort {
	public static void SelectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}

				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		SelectionSort(arr);
		for (int val : arr) {
			System.out.println(val);
		}
		s.close();
	}
}
