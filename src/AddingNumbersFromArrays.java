
package src;

public class AddingNumbersFromArrays {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 5;
		for (int i = 0; i <number.length; i++) {
			for (int j = 0; j <number.length; j++) {
				if (number[i] + number[j] == sum)
				{
					System.out.println("the pairs are " + number[i] + " and " + number[j]);
				}
			}
		}

	}

}
