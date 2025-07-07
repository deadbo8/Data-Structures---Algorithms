package codeSkiller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumOfTwoArrays {

	public static void SumofTwoArrays(int[] arr1, int[] arr2) {
		ArrayList<Integer> l = new ArrayList<>();
		int i = arr1.length - 1;
		int j = arr2.length - 1;

		int carry = 0;

		while (i >= 0 && j >= 0) {
			int sum = carry + arr1[i] + arr2[j];
			l.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}

		while (i >= 0) {
			int sum = carry + arr1[i];
			l.add(sum % 10);
			carry = sum / 10;
			i--;
		}
		while (j >= 0) {
			int sum = carry + arr2[j];
			l.add(sum % 10);
			carry = sum / 10;
			j--;
		}
		if (carry != 0) {
			l.add(carry);
		}
		Collections.reverse(l);
		
		int[] ans = new int[l.size()];
		
		for(int k =0; k<ans.length;k++) {
			ans[k]=l.get(k);
		}
		
		for(int val:ans) {
			System.out.print(val+", ");
		}
		System.out.print("END");
		
		
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		ArrayList<Integer> l = new ArrayList<>();

		int n1 = s.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = s.nextInt();
		}

		int n2 = s.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = s.nextInt();
		}

		SumofTwoArrays(arr1, arr2);
		s.close();
	}
}
