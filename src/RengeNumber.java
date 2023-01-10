
package src;

import java.util.Scanner;

public class RengeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number1=0;
		int number2=0;

		boolean condition = true;

		while (condition) {
			System.out.println("please Enter the first Number: ");
			number1 = sc.nextInt();
            
			if(number1>100)
			{
				System.out.println("Please Enter the number that is between 1 - 100 ");
			}
			else
			{
				condition=false;
			}
			
		}
		condition =true;
		
		while(condition)
		{
			System.out.println("please Enter the Second Number: ");
			number2 = sc.nextInt();
			if(number2<1)
			{
				System.out.println("Please Enter the number that is above 0 ");
			}
			else 
			{
				condition=false;
			}
			
		}
		condition =true;	
		
		System.out.println("The First Number is:" + number1 );
		System.out.println("The Second Number is:" + number2);
        
		//my task 1
	}

}









