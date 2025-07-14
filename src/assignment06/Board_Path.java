package assignment06;

import java.util.Scanner;

public class Board_Path {
	
	public static int path(int n, int m, String s) {
		if(n==0) {
			System.out.print(s+" ");
			return 1;
		}
		
		if(n<0) {
			return 0;
		}
		
		int count=0;
		for(int i=1; i<=m;i++) {
			count+=path(n-i,m,s+i);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		
		
		int count=path(n,m,"");
		System.out.println(count);

		s.close();
	}
}
