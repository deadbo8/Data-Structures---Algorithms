package assignment03;

import java.util.Scanner;

public class SortZeroAndOne {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int n = s.nextInt(), ZeroCount=0, OneCount=0;

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			if(arr[i]==0) {
				ZeroCount++;
			}else {
				OneCount++;
			}
		}

		for (int i = 0; i <ZeroCount; i++) {
			System.out.print("0 ");
			
		}

		for (int i = 0; i < OneCount; i++) {
			System.out.print("1 ");
		}

		s.close();
	}
}
