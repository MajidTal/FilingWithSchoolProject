

package src;

import java.util.Arrays;

public class GetingHighestSecondNumber {


	public static void main(String[] args) {
		
        int[] arryNumber= {1,44,6,98,534,7,545,9,3};
        int a = arryNumber.length;
        
        //sort array
        Arrays.sort(arryNumber);
        System.out.println("The second highest number is:" + arryNumber[a-2] );
        
        
	}

}
