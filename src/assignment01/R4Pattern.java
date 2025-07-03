package assignment01;

import java.util.Scanner;

public class R4Pattern {

	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();

	        int totalRows = 2 * n - 1;
	        int row = 1;

	        while (row <= totalRows) {
	            int nsp, nst, startVal;

	            if (row <= n) {
	                nsp = n - row;
	                nst = 2 * row - 1;
	                startVal = row;
	            } else {
	                nsp = row - n;
	                int mirrorRow = totalRows - row + 1;
	                nst = 2 * mirrorRow - 1;
	                startVal = mirrorRow;
	            }

	            int i = 0;
	            while (i < nsp) {
	                System.out.print("\t");
	                i++;
	            }

	            int val = startVal;
	            i = 1;
	            while (i <= nst) {
	                System.out.print(val + "\t");
	                if (i <= nst / 2) {
	                    val++;
	                } else {
	                    val--;
	                }
	                i++;
	            }

	            System.out.println();
	            row++;
	        }

	        s.close();

	}

}
