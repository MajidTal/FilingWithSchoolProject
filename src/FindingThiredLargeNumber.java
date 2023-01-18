
package src;

import java.util.Arrays;

public class FindingThiredLargeNumber {

	public static void highesThirdNumber(int[] array) {
	int a = array.length;
	// sort array
	Arrays.sort(array);
	System.out.println("The Third highest number from array are:" + array[a - 3]);
	

	}
	public static void main(String[] args) {
		

		int[] arryNumber = { 1, 5, 9, 3, 7, 8, 2, 4, 6 };
		highesThirdNumber(arryNumber);
		
	}

}
