package lecture12;
import java.util.Scanner;

public class HorizontalWave {
	public static void Print(int[][] arr) {
		for (int j = 0; j < arr[0].length; j++) {
			int i = 0;
			if (j % 2 != 0) {
				i = arr.length - 1;
				while (i >= 0) {
					System.out.print(arr[i][j] + " ");
					i--;
				}
			} else {
				while (i < arr.length) {
					System.out.print(arr[i][j] + " ");
					i++;
				}
			}
			System.out.print("  ");
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		Print(arr);

		s.close();
	}
}
