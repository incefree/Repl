package repl;

import java.util.Scanner;

public class Repl144_MethodsPlusMinus {
	public static void plus_minus(int[] arr) {
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positiveCount++;
			}
			if (arr[i] < 0) {
				negativeCount++;
			}
			if (arr[i] == 0) {
				zeroCount++;
			}
		}
		System.out.println("positives:" + positiveCount + ", negatives:" + negativeCount + ", zeros:" + zeroCount);
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}

		plus_minus(arr);
		inp.close();
	}// end main
}
