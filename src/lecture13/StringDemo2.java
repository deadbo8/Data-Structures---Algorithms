package lecture13;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1= "Hello";   //stringpool/internpool(special area) me save hoga in heap space s1=2k
		String s2="Hello";   //doesnt create duplicate assigns s2=2k
		String s3= new String("Hello"); // creates in heap but outside pool s3=3k;
		String s4= new String("Hello");  // outside of pool s4=4k;
		
		s1=s1+"bye";  // creates a copy outside of pool and concatenates the string at 7k;
		System.out.println(s1);
		
		char a = s1.charAt(0);
		System.out.println(a);// returns character at index 0
		
	}
}
