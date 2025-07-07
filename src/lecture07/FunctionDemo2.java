package lecture07;

public class FunctionDemo2 {
	
	public static void main(String[] args) {
		System.out.println("hey");
		int a=89;
		System.out.println(a);
		System.out.println(addition());
		System.out.println("Bye");
	}
	
	public static int addition() {
		int a =9;
		int b =7;
		int c = a +b;
		return c+sub();
	}
	
	public static int sub() {
		int a =19;
		int b =7;
		int c =a-b;
		return c;
	}

}
