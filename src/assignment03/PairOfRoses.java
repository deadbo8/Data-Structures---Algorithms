package assignment03;

import java.util.Scanner;

public class PairOfRoses {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		while(T-->0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i =0; i<n;i++) {
				
				arr[i]=s.nextInt();
			}
			int money= s.nextInt();
			
			int costR1=0;
			int costR2=Integer.MAX_VALUE;
			
			for(int i =0 ;i<n-1;i++) {
				for(int j =i+1;j<n;j++) {
					if(arr[i]+arr[j]==money) {
						int max = Math.max(arr[i], arr[j]);
						int min = Math.min(arr[i], arr[j]);
						if(max-min<costR2-costR1) {
							costR1=min;
							costR2=max;
						}
					}
				}
				 
			}
			
			System.out.println("Deepak should buy roses whose prices are "+costR1+" and "+costR2+".");
			
			
		}
		s.close();
	}
}
