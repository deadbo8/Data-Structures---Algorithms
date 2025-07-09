package assignment03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="())))))))))))))))))(";
		
		int count = 0;
		
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				count++;

			}

		
		
		}
		System.out.println(count);
		

}
}
