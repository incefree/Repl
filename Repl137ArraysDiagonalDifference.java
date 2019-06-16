package repl;

import java.util.Scanner;

public class Repl137ArraysDiagonalDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
		int result = 0;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
			sum1 += matrix[i][i];
			sum2 += matrix[i][j];
		}
		result = sum1 - sum2;
		System.out.println(Math.abs(result));
		scan.close();
	}
}
//int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6},{7, 8}}};
//System.out.println(array[0][1][1]);
//System.out.println(array[1][1][0]);