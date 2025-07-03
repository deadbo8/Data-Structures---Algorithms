package assignment03;


// we can also this in O(n) complexity by using two pointer approach; left and right and pos; 

import java.util.Scanner;

public class SquaresOfSortedArray {
	
	public static void SelectionSort(int[] arr) {		
		
		for(int i =0; i<arr.length-1;i++) {		
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			
			int temp = arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;	
		}	
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<n;i++) {
			arr[i]=s.nextInt();
			arr[i]*=arr[i];
		}
		
		SelectionSort(arr);
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}	
		s.close();

	}
}
