package leetcode;

public class SearchIn2dMatrix_StairCaseSearch_240 {

	public static void main(String[] args) {

//		int[][] mat= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		
		int[][] mat= {{-1,3}};

		int target = 3;

		boolean isPresent = false;

		int size = mat[0].length;
		System.out.println("size is "+size);
		
		int tR = 0, tC = size-1;
		
		while(tR<mat.length && tC>=0) {
			System.out.println("the current row is: "+tR+"  the current column is: "+tC+"  mat[tR][tC] is: "+mat[tR][tC]);
			
			if(mat[tR][tC]==target) {
				isPresent=true;
				break;
			}else if(mat[tR][tC]>target) {
				tC--;
				System.out.println("tC changed");
			}else {
				tR++;
				System.out.println("tR changed");
			}
				
		}

		
		System.out.println(isPresent);
	}

}
