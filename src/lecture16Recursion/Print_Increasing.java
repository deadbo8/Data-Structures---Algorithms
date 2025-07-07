package lecture16Recursion;

import java.util.Scanner;

public class Print_Increasing {
	
	public static void print(int n ) {
		
		// base	
		if(n<=0) {
			return ;
		}
			
		//recursive call
		print(n-1);
			    
		//calculation
		System.out.println(n);
				
	}
		    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		print(n);
		
		s.close();
	}
}
