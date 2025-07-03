package lecture14;

public class WrapperClass_Demo {
	public static void main(String[] args) {
		
		
		Integer a =128; // primitive in stack
		
		Integer b = 128; //non-primitive in heap  b in in stack storing adress 2k, and content is stored in heap at 2k
		
		
		System.out.println(a==b); //out of range of -128 to 127
		
		Boolean c=true; 
		Boolean d=true;
		
		System.out.println(c==d);
	}
}
