package assignment06;

import java.util.Scanner;

public class Twins {
	
	
	
	public static int findTwins(String twins,int first, int second, int count) {
		
		
		
		if(second>=twins.length()) return 0;
		
		count = (twins.charAt(first)==twins.charAt(second))? 1: 0;
		
			
		return count + findTwins(twins, first+1, second+1,count);
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String twins = s.next();
		
		
		int count = findTwins(twins,0,2,0);
		
		System.out.println(count);
		
		s.close();
	}
}
