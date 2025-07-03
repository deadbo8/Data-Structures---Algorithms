package lecture10;

public class KthRoot {
	
	public static int KRoot(int n ,int k) {
		int root=0, lo=0, hi=n;
		while(lo<=hi) {
			int mid =(lo+hi)/2;
			if(Math.pow(mid, k)<=n) {
				root=mid;
				lo=mid+1;
			}else {
				hi=mid-1;
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
		int n =147, k=3;
		System.out.println(KRoot(n, k));
	}

}
