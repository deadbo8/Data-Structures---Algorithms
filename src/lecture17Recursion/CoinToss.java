package lecture17Recursion;

public class CoinToss {

	public static void outcomes(int n, String s) {
		if (n == 0) {
			System.out.println(s);
			return;
		}

		outcomes(n - 1, s + "H");
		outcomes(n - 1, s + "T");

	}

	public static void main(String[] args) {

		int n = 2;
		outcomes(n, " ");
	}
}
