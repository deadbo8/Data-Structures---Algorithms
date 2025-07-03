package lecture13;

public class LexographicalOrder {
	
	public static int compare(String s1, String s2) {
		if(s1==s2) {
			return 0;
		}
		
		int n = Math.min(s1.length(), s2.length());
		for(int i =0; i<n;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
		
		
		
	}
	public static void main(String[] args) {
		String s1="Komal";
		String s2="Kunal";
		
//		System.out.println(s1.compareTo(s2)); // +ve s1 is larger , -ve s1 is smaller , 0 same
		
		String s3="ankit";
		String s4="ankita";
		System.out.println(compare(s1, s2));
	}
}
