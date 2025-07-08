package lecture17Recursion;

public class SubsequenceDemo {  // string formed after removing zero or mpre charatcter.The relative order/position is preserved.
	
	
	public static void sub(String s, String s1 ) {
		//
		if(s.length()==0) {
			 System.out.println(s1);
			 return;
		}
		
		
		sub(s.substring(1),s1+s.charAt(0));
		sub(s.substring(1),s1);
		
		
		
	}
	public static void main(String[] args) {
		
		String s = "abc";
		
		String s1=" ";
		
		sub(s, "");
		
	}
}
