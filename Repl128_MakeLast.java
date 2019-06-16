package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl128_MakeLast {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		int[] newArray = new int[2 * nums.length];
	    newArray[newArray.length - 1] = nums[nums.length - 1];

		System.out.println(Arrays.toString(newArray));
		scan.close();
	}

}
