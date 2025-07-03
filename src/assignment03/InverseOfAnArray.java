
package assignment03;

import java.util.Scanner;

public class InverseOfAnArray {

	public static void inverseArray(int[] arr, int[] nums) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int temp = arr[i];
			nums[temp] = i;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			nums[i] = arr[i];
		}

		inverseArray(arr, nums);

		for (int val : nums) {
			System.out.print(val + " ");
		}

		s.close();

	}

}
