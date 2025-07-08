package lecture17Recursion;

//simpler method could use an if condition which has s.contains("HH")

public class CoinToss_withNoConsequetiveHH {

	public static void outcomes(int n, String s) {
		if (n == 0) {
			System.out.println(s);
			return;
		}

			outcomes(n - 1, s + "H");
			
			if (s.length() <= 1 || !(s.charAt(s.length() - 1) != 'T' && s.charAt(s.length() - 2) != 'T' )) {
			outcomes(n - 1, s + "T");
			}
	}

	public static void main(String[] args) {
		int n = 3;

		outcomes(n, "");
	}
}
