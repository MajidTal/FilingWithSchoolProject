

package src;

public class LargestNumber {

	public static void main(String[] args) {

		int[] arry = { 3, 6, 77, 345, 8, 68};
		
		System.out.println("The elemnt in the array is:");
		for( int i=0 ; i<arry.length; i++)
		{
			System.out.print(arry[i] + "   ");
		}
		int maxnumber = arry[0];
		for( int i=0 ; i<arry.length; i++)
		{
			if(arry[i] > maxnumber)
			{
				maxnumber = arry[i];
			}
		}
		
	
		System.out.println( "\n The larges number from array is: " + maxnumber );
	}

}
