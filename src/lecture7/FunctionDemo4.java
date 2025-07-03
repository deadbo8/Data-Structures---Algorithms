package lecture7;

public class FunctionDemo4 {
	static int val=100;
	
	public static void main(String[] args) {
		
		System.out.println("hey");
		int a =8;
		int b =7;
		System.out.println(add(b, a));
		System.out.println(val);
		System.out.println("bye");
	}
	
	public static int add(int a , int b ) {
		int c =a+b;
		FunctionDemo4.val=FunctionDemo4.val-5;
		return c+sub(c, a);
	}
	public static int sub(int a , int b ) {
		int c =a-b;
		return c;
	}

}
