package lecture07;

import java.util.Scanner;

public class FunctionDemo {

	public static void addition() {
		int a = 9;
		int b = 7;
		int c = a + b;
		sub();
		System.out.println(c);
	}

	public static void sub() {
		int a = 9;
		int b = 7;
		int c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("hey");
		addition();
		System.out.println("bye");
		s.close();
	}
}
