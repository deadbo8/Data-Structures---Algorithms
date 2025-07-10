package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs_70_RecursionAndDP {

	public static int totalCombination(int n) {

		int[] arr = new int[n+1];

		Arrays.fill(arr, -1);

		return helper(n, arr);
	}

	public static int helper(int n, int[] arr) {

		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}

		if (arr[n] != -1) return arr[n];
			int x = helper(n - 1,arr);
			int y = helper(n - 2,arr);
			

		return arr[n]=x+y;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		System.out.println(totalCombination(n));
		s.close();
	}
}
