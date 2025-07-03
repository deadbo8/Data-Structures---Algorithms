package assignment02;

import java.util.Scanner;

public class ReplaceThemAll {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		String s1= Integer.toString(n);
		String s2= s1.replace('0', '5');
		
		int replaced = Integer.parseInt(s2);
		
		System.out.println(replaced);
		
		s.close();
	}
}
