package lecture03;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int i = 0;
		
		for(;i<n;i++) {
			System.out.println("hello world");
		}
		
		System.out.println(i);

//		while (i < n) {
//			System.out.println("Hello Word");
//			i++;
//		}

		s.close();
	}
}
