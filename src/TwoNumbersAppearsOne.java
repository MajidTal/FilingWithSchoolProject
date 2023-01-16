
 
package src;

import java.util.Stack;

public class TwoNumbersAppearsOne {

	public static void main(String[] args) {
		
		int[] number= {44,55,66,44,55,66,45,65};
		Stack<Integer> stack = new Stack<Integer>();
		
		
		for(int i=0; i<number.length;i++)
		{
			int count =0;
			for(int T=0; T <number.length; T++)
			{
				if(number[i] == number[T])
				{
				count++;	
				}
			}
			if(count == 1)
			{
				stack.push(number[i]);
			}
		}
		System.out.println(stack);
		
	}

}
