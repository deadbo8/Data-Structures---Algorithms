package assignment03;

import java.util.Scanner;

public class RainWaterTrapping {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while (t > 0) {

			int n = s.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}

			int l = 0, r = arr.length - 1, lmax = 0, rmax = 0;
			int water = 0;

			while (l < r) {
				if (arr[l] < arr[r]) {
					if (arr[l] > lmax) {
						lmax = arr[l];
					} else {
						water += lmax - arr[l];
					}
					l++;
				} else {
					if (arr[r] > rmax) {
						rmax = arr[r];
					} else {
						water += rmax - arr[r];
					}
					r--;
				}

			}
			System.out.println(water);
			t--;
		}
		s.close();
	}
}