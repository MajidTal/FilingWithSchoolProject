
package src;

import java.util.Arrays;

public class GetingHighestSecondNumber {

	public static void main(String[] args) {

		int[] arryNumber = { 1, 5, 9, 3, 7, 8, 2, 4, 6 };
		int a = arryNumber.length;
		// sort array
		Arrays.sort(arryNumber);
		System.out.println("The Third highest number from array are:" + arryNumber[a - 3]);

	}

}
