package lecture13;

public class Substring {
	
	public static void PrintsubString(String s) {
		for(int i =0; i<s.length();i++) {
			for(int j =i;j<s.length();j++) {
				System.out.println(s.substring(i,j+1));
			}
		}
	}
	public static void main(String[] args) {
		String s= "codingblocks";
		
//		System.out.println(s.substring(2,7));
		PrintsubString(s);
	}
}
