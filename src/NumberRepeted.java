
package src;

import java.util.Scanner;

public class NumberRepeted {

	public static void main(String[] args) {

		int[] my_array = { 1, 2, 5, 5, 5, 6, 6, 7, 2 };
		System.out.print("The element of array is: ");
		for (int i = 0; i < my_array.length; i++) {
	       System.out.print(my_array[i] + " ");
		 }

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number: ");
		int a = sc.nextInt();

		int counter = 0;
		for (int i = 0; i < my_array.length; i++) {
			if (my_array[i] == a)

			{
				counter++;

			}

		}
		System.out.println("\n The number is repeted :" + counter + " times ");

	}

}
