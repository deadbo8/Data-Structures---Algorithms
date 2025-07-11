package lecture19;

public class SeatProblem_PrecurserToNQueens {
	
	public static void seating(int n, boolean[] seat, String ans, int pos) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i =pos; i<seat.length;i++) {
			if(seat[i]==false) {
				seat[i]=true;
				seating(n-1,seat,ans+"S"+i,i);
				seat[i]=false;
			}
			
		}
	}
	public static void main(String[] args) {
		int n = 2;
		int s = 4;
		
		boolean[] seat = new boolean[s];
		
		seating(n, seat,"",0);
	}
	
}
