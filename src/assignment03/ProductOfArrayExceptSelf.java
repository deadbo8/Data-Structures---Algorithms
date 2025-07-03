package assignment03;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr= new int[n];
		for(int i =0; i<n;i++) {
			arr[i]=s.nextInt();
		}
		int[] res= new int[n];
		for(int i=0;i<n;i++) {
			res[i]=1;
		}
		
		
		for(int j=0; j<n;j++) {
		for(int i =0; i<n;i++) {
			if(i!=j) {
				res[j]*=arr[i];
			}
			
		}
		
		}
		for(int val:res) {
			System.out.print(val+" ");
		}
		s.close();
	}
}	
