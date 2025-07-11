package leetcode;

public class Pow_xn_50 {
	

	public static double myPow(double x, int n) {

		double y = 1.0;
		int pow = Math.abs(n);

		y = helper(x, pow);

		return (n > 0) ? y : 1.0 / y;

	}

	public static double helper(double x, int pow) {
			if(pow==0) {
				return 1.0;
			}
			
			return x * helper(x, pow - 1);
	}

	public static void main(String[] args) {
		int n = 10;
		double x = 2.0000;
		System.out.println(myPow(x, n));
	}
}
