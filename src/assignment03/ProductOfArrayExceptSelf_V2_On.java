package assignment03;

import java.util.Scanner;

public class ProductOfArrayExceptSelf_V2_On {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int[] arr = new int[n];

	for (int i = 0; i < n; i++) {
		arr[i] = s.nextInt();
	}

	int[] res = new int[n];

	res[0] = 1;

	for (int i = 1; i < n; i++) {
		res[i] = res[i - 1] * arr[i - 1];
	}

	int rightProduct = 1;

	for (int i = n - 1; i >= 0; i--) {
		res[i] = res[i] * rightProduct;
		rightProduct *= arr[i];
	}

	for (int val : res) {
		System.out.print(val + " ");
	}
	s.close();
}
}
