package assignment03;

import java.util.Scanner;

public class ReverseAnArray {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int[] arr = new int[n];

	for (int i = 0; i < n; i++) {
		arr[i] = s.nextInt();
	}

	for (int i = 0; i < n; i++) {
		System.out.println(arr[n - 1 - i]);
	}
	s.close();
}
}
