package codeSkiller;

import java.util.Scanner;

public class PlayingWithGoodString {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String s1= s.nextLine();
		
		int count=0;
		int ans=0;
		
		for(int i = 0; i< s1.length();i++){
			if(s1.charAt(i)=='a' ||s1.charAt(i)=='e' ||s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u') {
				count++;
			}else {
				ans=Math.max(ans, count);
				count=0;
			}
					
		}
		ans=Math.max(ans, count);
		
		System.out.println(ans);
		s.close();
	}
}
