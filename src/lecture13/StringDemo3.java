package lecture13;

public class StringDemo3 {
	public static void main(String[] args) {
		System.out.println("hello"+10+20+"bye"); // String plus any data type prints string
		System.out.println("hello"+(10+20)+"bye");  // solves bracket first
		System.out.println(10+20+"hello"+"bye");
		String s="";
	}
}
