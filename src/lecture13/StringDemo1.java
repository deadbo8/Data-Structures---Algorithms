package lecture13;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1= "Hello";   //stringpool/internpool(special area) me save hoga in heap space s1=2k
		String s2="Hello";   //doesnt create duplicate assigns s2=2k
		String s3= new String("Hello"); // creates in heap but outside pool s3=3k;
		String s4= new String("Hello");  // outside of pool s4=4k;
		System.out.println(s1);
		
		System.out.println(s1==s2);  //compares address;
		System.out.println(s3==s2);
		System.out.println(s4==s1);
		int[] arr = new int[5];
		System.out.println(arr.length);
		System.out.println(s1.length());
		
		System.out.println(s1.equals(s2));  //compares content;
		
		
		String S5="Hello"+"Bye"; //creates in pool;

		

	}

}
