
package src;

import java.util.Arrays;

public class MaximumFourthIntegersNumbersFromArray {


	public static void main(String[] args) {
	int[] Array = {6,5,4,3,2,1};
	Arrays.sort(Array);   
	System.out.print("the elements of array are:");
	for(int i=0; i<Array.length; i++) {
		
		System.out.print(Array[i]);
	}
	int result1 = Array[5];
	int result2 = Array[4];
	int result3 = Array[3];
	int result4 = Array[2];
	System.out.println("");
	System.out.println("The biggest fourth number in array are:{ "+Array[5]+ " "+Array[4] +" "+ Array[3]+" " + Array[2] + " }");
	System.out.println("the sum of the multiple forth number is:" + Array[5]*Array[4]*Array[3]*Array[2]);
     
	}

}
