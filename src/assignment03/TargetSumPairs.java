package assignment03;

import java.util.Scanner;

public class TargetSumPairs {

	public static void FindPairs(int[] arr, int target) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;

		while (left <= right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				System.out.print(arr[left] + " and " + arr[right]);
				System.out.println();
				left++;
				right--;
			} else if(sum>target){
				right--;
			}else {
				left++;
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
		FindPairs(arr, target);
		s.close();
	}
}
