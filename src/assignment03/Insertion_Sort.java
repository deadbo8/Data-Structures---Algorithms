package assignment03;

import java.util.Scanner;

public class Insertion_Sort {
	public static void InsertionSort(int[] arr) {
		int n = arr.length;

		for(int i=1; i<n;++i) {
			int key=arr[i];
			int j =i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		InsertionSort(arr);
		for (int val : arr) {
			System.out.print(val+" ");
		}
		s.close();
	}
}
