package lecture15;

import java.util.Scanner;

public class Wrapper_Class {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a =10; //stored in stack
		Integer a1=10; //stored in heap
		
		Long l = 6789l;
		
		a1=a;
		
		int b = 9;
		Integer b1=8;		
		b1=b;
		
		Integer c1=19;
		Integer c2=19;
		Integer c3=198;
		Integer c4 =198;
		
		System.out.println(c1==c2);
		System.out.println(c3==c4);
		
		
		
		s.close();
	}
}
