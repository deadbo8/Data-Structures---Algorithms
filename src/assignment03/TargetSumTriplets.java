package assignment03;


//Current time complexity is O(n3) but can be done in O(n2) using two pointer approach

import java.util.Scanner;

public class TargetSumTriplets {

	public static void findTriplets(int[] arr, int target) {
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						System.out.print(arr[i] + ", " + arr[j] + " and " + arr[k]);
						System.out.println();
					}
				}
			}
		}
	}

	public static void SelectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int target = s.nextInt();

		SelectionSort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

		findTriplets(arr, target);
		s.close();
	}
}
