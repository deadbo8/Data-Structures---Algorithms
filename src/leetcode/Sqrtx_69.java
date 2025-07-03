package leetcode;

public class Sqrtx_69 {
public static void main(String[] args) {
	int n =2147395599;
	
	long lo =0, hi=n;
	int sqrt=1;
	while(lo<=hi) {
		long mid = lo+(hi-lo)/2;
		
		if(mid*mid<=n) {
			sqrt=(int)mid;
			lo=mid+1;
		}else {
			hi=mid-1;
		}
		
	}
	System.out.println(sqrt);
	
}
}
