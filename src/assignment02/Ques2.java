package assignment02;

import java.util.Scanner;

public class Ques2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int digit = s.nextInt();
		int count=0;
		
		while(n>0) {
			if(n%10==digit) {
				count++;
			}
			n/=10;
		}
		System.out.println(count);
		s.close();
	}

}
